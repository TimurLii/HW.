package HW;


public enum Holiday {
    NEWYEAR("31.12"), WOMENS_DAY("08.03"), MENS_DAY("23.02");
    private String date;
    Holiday(String date) {
        this.date = date;
    }

    public String getDate()  {
//        SimpleDateFormat format = new SimpleDateFormat("ddMM");
//        format.parse(date);
        return date;
    }
}
