/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author moulaYounes
 */
public class DateUtil {

    public static int[] nextMois(int mois,int annee){
      if(mois==0 && annee ==0){
          mois = new Date().getMonth()+1;
          annee= new Date().getYear()+1900;                                     // date par defaut mdekalyia 3ndhiom b 1 f les mois o 1900 f les annee dakechi dyial le pape gregore :p
          return new int[]{mois,annee};
      }
        if(mois<12){
            return new int[]{++mois,annee};
        }else{
             return new int[]{1,++annee};
        }
    }
    public static java.sql.Date getSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    public static java.sql.Timestamp convertFromDateToTimestamp(java.util.Date date) {
        return new java.sql.Timestamp(date.getTime());
    }

    public static java.sql.Timestamp getSqlDateTime(java.util.Date date) {
        return new java.sql.Timestamp(date.getTime());
    }

    public static String getYearOfCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        return simpleDateFormat.format(new Date());
    }

    public static String formateDate(String pattern, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

}
