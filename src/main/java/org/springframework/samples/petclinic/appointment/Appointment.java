package org.springframework.samples.petclinic.appointment;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.PetType;


/**
 * Simple JavaBean domain object representing an person.
 *
 * @author Mangesh N
 */
@Entity
@Table(name = "appointment")
public class Appointment extends BaseEntity{
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "appointment_date")
    @NotEmpty
    private Date appointmentDate;
	
	@Column(name = "pet_id")
    private Integer pet_id;

	@Column(name = "owner_id")
    private Integer owner;
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
    
    
	
}
