public class HandWatch {
    private String state, state1;
     int minute, hour, day, month, year;

    public HandWatch(){
        minute = 0; hour = 0; day = 1; month = 1; year = 2000;
        state = "NORMAL"; state1 = "TIME";
    }

    public void displayDate(){
        System.out.println(year + "-" + month + "-" + day);
    }

    public void displayTime(){
        System.out.println(hour + ":" + minute);
    }

    public void increase(String state1){
        switch (state1){
            case "MINUTE":
                if (minute < 59) minute++;
                else minute = 0;
                break;
            case "HOUR":
                if (hour < 23) hour++;
                else hour = 0;
                break;
            case "DAY":
                if (day < 31) day++;
                else day = 1;
                break;
            case "MONTH":
                if (month < 11) month++;
                else month = 1;
                break;
            case "YEAR":
                if (year < 2999 ) year++;
                else year = 2000;
        }

    }
    public void operate(String inputs) {
        for (char input : inputs.toCharArray()) {

            switch (state) {
                case "NORMAL":
                    if (input == 'c') {
                        state = "UPDATE";
                        state1 = "MINUTE";
                    }
                    else if (input == 'b') {
                        state = "ALARM";
                        state1 = "ALARM";
                    }
                    else if (input == 'a'){
                        if (state1.equals("TIME")) state1 = "DATE";
                        else state1 = "TIME";
                    }
                    break;

                case "UPDATE":
                    if (input == 'b') increase(state1);
                    else if (input == 'a') {
                        if (state1.equals("MINUTE")) state1 = "HOUR";
                        else if (state1.equals("HOUR")) state1 = "DAY";
                        else if (state1.equals("DAY")) state1 = "MONTH";
                        else if (state1.equals("MONTH")) state1 = "YEAR";

                    }
                    break;

                case "ALARM":
                    if (input == 'a') state1 = "CHIME" ;
                    break;
            }
        }
    }

}
