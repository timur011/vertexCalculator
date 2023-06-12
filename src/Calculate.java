public class Calculate {
    private String formula;
    private MainGUI game;
    public Calculate(){
        game = new MainGUI(this);
    }

    public void setFormula(String formula){
        this.formula=formula;
    }
    public double getStandardX(){
        double a;
        if(formula.substring(0, 1).equals("x")){
            a = 1;
        }else {
            a = Double.parseDouble(formula.substring(0, formula.indexOf("x")));
        }
        int location = formula.indexOf("^");
        int finalLoc = formula.lastIndexOf("x");
        String x = "";
        String newStr = formula.substring(location, finalLoc);
        if(newStr.contains("+")){
            x = newStr.substring(newStr.indexOf("+"));
            return (-1*Double.parseDouble(x)) / (2*a);
        }
        else if(newStr.contains("-")){
            x = newStr.substring(newStr.indexOf("-"));
            return (-1*Double.parseDouble(x)) / (2*a);
        }
        return 0;

    }
    public double getStandardY() {
        double firstPart, secondPart, thirdPart;
        double a;
        if (formula.substring(0, 1).equals("x")) {
            a = 1;
        } else {
            a = Double.parseDouble(formula.substring(0, formula.indexOf("x")));
        }
        secondPart = 0;
        double xCoor = getStandardX();
        firstPart = a * (xCoor * xCoor);
        double bValue;
        String b = formula.substring(formula.indexOf("^"), formula.lastIndexOf("x"));
        if (b.contains("+")) {
            bValue = Double.parseDouble(b.substring(b.indexOf("+") + 1));
            secondPart = bValue * xCoor;
        } else if (b.contains("-")) {
            bValue = Double.parseDouble(b.substring(b.indexOf("-") + 1));
            secondPart = bValue * xCoor;
            secondPart *= -1;
        }
        thirdPart = Double.parseDouble(formula.substring(formula.lastIndexOf("x") + 2));
        if (formula.substring(formula.lastIndexOf("x")).contains("-")) {
            thirdPart *= -1;
        }

        return firstPart + secondPart + thirdPart;

    }
        public double getX(){
            String temp = formula.substring(0, formula.indexOf("^"));
            boolean positive = true;
            int firstLoc = 0;
            if(temp.contains("+")){
                firstLoc = temp.indexOf("+");
            }
            else if(!temp.contains("+")){
                firstLoc = temp.indexOf("-");
                positive = false;
            }
            if(positive) {
                return -1 * Double.parseDouble(temp.substring((firstLoc + 1), temp.indexOf(")")));
            }
            else if(!positive){
                return Double.parseDouble(temp.substring((firstLoc + 1), temp.indexOf(")")));
            }
            return 0;

        }
        public double getY(){
            String temp2 = formula.substring(formula.indexOf("^"));
            int yLoc = 0;
            boolean up = true;
            if(temp2.contains("+")){
                yLoc = temp2.indexOf("+");
            }
            else if(!temp2.contains("+")) {
                yLoc = temp2.indexOf("-");
                up = false;
            }
            else{
                return 0;
            }
            if(up) {
                return Double.parseDouble(temp2.substring(yLoc + 1));
            }
            else if(!up){
                return -1 * Double.parseDouble(temp2.substring(yLoc + 1));
            }else{
                return 0;
            }

        }

        public String returnV(){
            if(formula.contains("(")){
                return "The vertex of the formula is (" + getX() + ", " + getY() + ")";
            }
            else{
                return "The vertex of the formula is (" + getStandardX() + ", " + getStandardY() + ")";
            }
        }

    }
