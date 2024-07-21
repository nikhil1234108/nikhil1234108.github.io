public class secondsandhours {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65,45));


    }

    public static String getDurationString(int sec) {
        if(sec > 0) {
            int min = sec / 60;
            int hr = min / 60;
            int hr1 = sec / 3600;
            int remmin = min % 60;
            int remsec = sec % 60;
            System.out.println("remaining minutes" + remmin);
            System.out.println("hours1=" + hr);
            System.out.println("remaining seconds=" + remsec);
            return hr + "H" + remmin + "M" + remsec + "S";
        }
        else {
            return "0:00";
        }
        }
        public static String getDurationString( int min, int sec){
            if(sec>=0 && sec<=59 && min>=0){
                int hr=min/60;
                int remmin=min%60;
                int remsec=sec%60;
                return hr+"H"+remmin+"M"+remsec+"S";
            }
            else {
                return "invalid";
            }
        }
    }
