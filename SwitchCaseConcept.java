public class SwitchCaseConcept {
    public static void main(String[] args) {
        String browser = "opera";
        switch (browser) {
            case "chrome":
                System.out.println("Launch chrome");
                if (10 > 5) {
                    System.out.println("10 is greater than 5");
                }
                break;
            case "firefox":
                System.out.println("Launch firefox");
                break;
            case "safari":
                System.out.println("Launch safari");
                break;
            default:
                System.out.println("Please pass the right browser");
                break;
        }

    }
}
