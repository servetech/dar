package org.rti.zcore.dar.gen.report;

import org.rti.zcore.EncounterData;
import org.rti.zcore.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.rti.zcore.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean AppointmentReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2012-09-14
 *         Time: 11:43:50
 *         Form Name: Appointment
 *         Form Id: 179
 */

/**
 * @hibernate.joined-subclass table="appointment"
 * @hibernate.joined-subclass-key column="id"
 */
public class AppointmentReport extends EncounterData {

private transient Date appointment_date;	//appointment_date field198
private String appointment_dateR;


 /**
  * @return
  * @hibernate.property column="appointment_date"
  */
    public Date getAppointment_date() {
        return this.appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }



    public String getAppointment_dateR() {
        return this.appointment_dateR;
    }

    public void setAppointment_dateR(String appointment_dateR) {
        this.appointment_dateR = appointment_dateR;
    }



}
