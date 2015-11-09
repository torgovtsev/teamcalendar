package com.github.teamcalendar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "QUESTION", uniqueConstraints = @UniqueConstraint(columnNames = "TEXT"))
public class QuestionEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "Text", unique = true, nullable = false, length = 4024)
    private String  text;

    public QuestionEntity()
    {
    }

    public QuestionEntity(String text)
    {
        this.text = text;
    }

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getQuestiontext()
    {
        return this.text;
    }

    public void setQuestiontext(String questiontext)
    {
        this.text = questiontext;
    }

}
