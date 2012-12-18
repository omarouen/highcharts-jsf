package nz.co.tradeintel.highcharts;




import java.util.Date;

    public class TimeData {
        private Date dateTime;
        private Number value;
        
        public TimeData(Date dateTime, Number number) {
            this.dateTime = dateTime;
            this.value = number;
        }
        
        public Date getDateTime() {
            return dateTime;
        }

        public void setDateTime(Date dateTime) {
            this.dateTime = dateTime;
        }

        public Number getValue() {
            return value;
        }

        public void setValue(Number number) {
            this.value = number;
        }
    }