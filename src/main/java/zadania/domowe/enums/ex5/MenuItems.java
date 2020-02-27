package zadania.domowe.enums.ex5;

public enum MenuItems implements Translatable{

    PRODUCTS,
    CONTACT,
    SITE_MAP,
    BLOG;

    MenuItems() {

    }

    public String translate(Language language) {
        switch(this){
            case PRODUCTS:
                switch (language) {
                    case PL:
                        return "Produkty";
                    case ENG:
                        return "Products";
                    case DE:
                        return "Produkte";
                }
            case CONTACT:
                switch (language){
                    case PL:
                        return "Kontakt";
                    case ENG:
                        return "Contact";
                    case DE:
                        return "Kontakt";
                }
            case SITE_MAP:
                switch(language){
                    case PL:
                        return "Mapa strony";
                    case ENG:
                        return "Site map";
                    case DE:
                        return "Sitemap";
                }
            case BLOG:
                switch (language) {
                    case PL:
                        return "Blog";
                    case ENG:
                        return "Blog";
                    case DE:
                        return "Blog";
                }
        }
        throw new UnsupportedOperationException("Unsupported language / label");
    }
}
