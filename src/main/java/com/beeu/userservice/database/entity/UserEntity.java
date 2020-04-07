package com.beeu.userservice.database.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Table(name = "BEEU_USER")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String name;
    private String middle_name;
    private String surname;
    private String company;
    private String url;
    private String fiscalCode;
    private String birthdate;
    private String relation;
    private String note;
    private Boolean active;
    private Boolean marketing_accepted;
    private Boolean service_accepted;
    private Date creation_date;
    private Date last_update_date;

    @Column(name = "BEE_ID")
    private String beeId;

    public UserEntity() {
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Date last_update_date) {
        this.last_update_date = last_update_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getMarketing_accepted() {
        return marketing_accepted;
    }

    public void setMarketing_accepted(Boolean marketing_accepted) {
        this.marketing_accepted = marketing_accepted;
    }

    public Boolean getService_accepted() {
        return service_accepted;
    }

    public void setService_accepted(Boolean service_accepted) {
        this.service_accepted = service_accepted;
    }

    public String getBeeId() {
        return beeId;
    }

    public void setBeeId(String beeId) {
        this.beeId = beeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(name, that.name) &&
                Objects.equals(company, that.company) &&
                Objects.equals(url, that.url) &&
                Objects.equals(birthdate, that.birthdate) &&
                Objects.equals(relation, that.relation) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, name, company, url, birthdate, relation, note);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserEntity{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", birthdate='").append(birthdate).append('\'');
        sb.append(", relation='").append(relation).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
