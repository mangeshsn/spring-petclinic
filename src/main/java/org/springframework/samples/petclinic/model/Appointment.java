package org.springframework.samples.petclinic.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;


/**
 * Simple JavaBean domain object representing an person.
 *
 * @author Mangesh N
 */
@MappedSuperclass
public class Appointment extends BaseEntity{
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "appointment_date")
    @NotEmpty
    private Date appointmentDate;

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
    
    
	
}
