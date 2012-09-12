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
 * JavaBean RegimenReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2012-02-13
 *         Time: 15:40:50
 *         Form Name: Regimen
 *         Form Id: 129
 */

/**
 * @hibernate.joined-subclass table="regimen"
 * @hibernate.joined-subclass-key column="id"
 */
public class RegimenReport extends EncounterData {

private transient String code;	//code field2144
private String codeR;
private transient String old_code;	//old_code field2298
private String old_codeR;
private transient String name;	//name field2145
private String nameR;
private transient String description;	//description field2146
private String descriptionR;
private transient Integer arv_option;	//arv_option field2147
private String arv_optionR;
private transient Integer regimen_group_id;	//regimen_group_id field2148
private String regimen_group_idR;
private transient Integer disabled;	//disabled field2265
private String disabledR;


 /**
  * @return
  * @hibernate.property column="code"
  */
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public String getCodeR() {
        return this.codeR;
    }

    public void setCodeR(String codeR) {
        this.codeR = codeR;
    }



 /**
  * @return
  * @hibernate.property column="old_code"
  */
    public String getOld_code() {
        return this.old_code;
    }

    public void setOld_code(String old_code) {
        this.old_code = old_code;
    }



    public String getOld_codeR() {
        return this.old_codeR;
    }

    public void setOld_codeR(String old_codeR) {
        this.old_codeR = old_codeR;
    }



 /**
  * @return
  * @hibernate.property column="name"
  */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getNameR() {
        return this.nameR;
    }

    public void setNameR(String nameR) {
        this.nameR = nameR;
    }



 /**
  * @return
  * @hibernate.property column="description" type="text"
  */
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getDescriptionR() {
        return this.descriptionR;
    }

    public void setDescriptionR(String descriptionR) {
        this.descriptionR = descriptionR;
    }



 /**
  * @return
  * @hibernate.property column="arv_option"
  */
    public Integer getArv_option() {
        return this.arv_option;
    }

    public void setArv_option(Integer arv_option) {
        this.arv_option = arv_option;
    }



    public String getArv_optionR() {
        return this.arv_optionR;
    }

    public void setArv_optionR(String arv_optionR) {
        this.arv_optionR = arv_optionR;
    }



 /**
  * @return
  * @hibernate.property column="regimen_group_id"
  */
    public Integer getRegimen_group_id() {
        return this.regimen_group_id;
    }

    public void setRegimen_group_id(Integer regimen_group_id) {
        this.regimen_group_id = regimen_group_id;
    }



    public String getRegimen_group_idR() {
        return this.regimen_group_idR;
    }

    public void setRegimen_group_idR(String regimen_group_idR) {
        this.regimen_group_idR = regimen_group_idR;
    }



 /**
  * @return
  * @hibernate.property column="disabled"
  */
    public Integer getDisabled() {
        return this.disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }



    public String getDisabledR() {
        return this.disabledR;
    }

    public void setDisabledR(String disabledR) {
        this.disabledR = disabledR;
    }



}