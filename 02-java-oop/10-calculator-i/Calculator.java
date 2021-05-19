class Calculator implements java.io.Serializable {
    private double one;
    private double two;
    private double result;
    private String operator;

    public Calculator() {

    }

    public void setOperandOne(double one) {

        this.one = one;
    }

    public void setOperandTwo(double two) {

        this.two = two;
    }
    public void setOperator(String x){

        this.operator = x;
    }
    public void performOperation(){
        if (this.operator.equals("+")){
            result = one + two;
        }
        if (this.operator.equals("-")){
            result = one - two;
        }
    

    }
    public void getResults(){

        System.out.println(result);
    }




}