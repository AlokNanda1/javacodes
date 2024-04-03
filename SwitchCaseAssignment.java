public class SwitchCaseAssignment {
    public static void main(String[] args) {

        char ch = 'a';
        switch (ch) {
            case 'a':
                System.out.println(ch + ": is a vowel");
                break;
            case 'e':
                System.out.println(ch + ": is a vowel");
                break;
            case 'i':
                System.out.println(ch + ": is a vowel");
                break;
            case 'o':
                System.out.println(ch + ": is a vowel");
                break;
            case 'u':
                System.out.println(ch + ": is a vowel");
                break;
            default:
                System.out.println(ch + ": is consonant");
                break;
        }

        String envName = "  QA";
        switch (envName.toLowerCase().trim()) {
            case "qa":
                System.out.println("run tests on QA");
                break;
            case "stage":
                System.out.println("run tests on stage");
                break;
            case "prod":
                System.out.println("run tests on prod");
                break;
            default:
                System.out.println("Please pass the correct environment");
                break;
        }

    }

}
