public class LetterColour {
    public String colors() {
        String firstLetter = UserDialogs.getLetter();
            switch (firstLetter) {
                case "B":
                    return "Blue";
                case "Y":
                    return "Yellow";
                case "R":
                    return "Red";
                case "G":
                    return "Green";
                case "P":
                    return "Pink";
                default:
                    return "Choose another letter";
            }
        }
    }