package patryk.zadania.api.exchange;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.http.HttpClient;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CurrencyGui extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        ExchangeApi api = new ExchangeApi();
        //pierwsza linia: "Podaj walutę źródłową" , [wybor]
        Set<String> currencies = api.getAvailableCurrencies();
        FirstLine firstLine = new FirstLine("Podaj walutę źródłową", new ArrayList<>(currencies));

        //druga linijka: "podaj kwotę" [wybor]
        Label secondLineLabel = new Label("Podaj kwotę");
        TextField secondLineField = new TextField();
        HBox secondLine = new HBox(secondLineLabel, secondLineField);

        //trzecia linijka "poda walute docelowa", [wybor]
        Label thirdLineLabel = new Label("Podaj walutę docelową");
        ComboBox<String> availableCurrencies2 = new ComboBox<>(FXCollections.observableList(new ArrayList<>(currencies)));
        HBox thirdLine = new HBox(thirdLineLabel, availableCurrencies2);


        //czwarta linijka: data
        Label fourthLabel = new Label("Wybierz datę");
        DatePicker picker = new DatePicker();

        HBox fourthLine = new HBox(fourthLabel, picker);

        root.getChildren().addAll(firstLine, secondLine, thirdLine, fourthLine);

        Button processButton = new Button("Licz wartość");
        Label result = new Label();


        processButton.setOnAction(e -> {
            try {
                LocalDate value = picker.getValue();
                String dateAsString = DateTimeFormatter.ISO_DATE.format(value);
                double courseFor = api.getCourseForDate(firstLine.getAvailableCurrencies().getSelectionModel().getSelectedItem(),
                        availableCurrencies2.getSelectionModel().getSelectedItem(),
                        dateAsString);
                result.setText(String.valueOf(courseFor));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        root.getChildren().addAll(processButton, result);


        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(CurrencyGui.class);
    }

}

class FirstLine extends HBox {
    Label firstLineLabel;
    ComboBox<String> availableCurrencies;

    public FirstLine(String labelText, List<String> comboBoxContent) {
        this.firstLineLabel = new Label(labelText);
        this.availableCurrencies = new ComboBox<>(FXCollections.observableList(comboBoxContent));
        this.getChildren().addAll(firstLineLabel, availableCurrencies);
    }

    public Label getFirstLineLabel() {
        return firstLineLabel;
    }

    public ComboBox<String> getAvailableCurrencies() {
        return availableCurrencies;
    }
}
