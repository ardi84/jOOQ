/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.example.jpa.jooq.tables.FilmActor;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmActorRecord extends UpdatableRecordImpl<FilmActorRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 838687978;

    /**
     * Setter for <code>PUBLIC.FILM_ACTOR.FILMS_FILMID</code>.
     */
    public void setFilmsFilmid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM_ACTOR.FILMS_FILMID</code>.
     */
    public Integer getFilmsFilmid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.FILM_ACTOR.ACTORS_ACTORID</code>.
     */
    public void setActorsActorid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM_ACTOR.ACTORS_ACTORID</code>.
     */
    public Integer getActorsActorid() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FilmActor.FILM_ACTOR.FILMS_FILMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return FilmActor.FILM_ACTOR.ACTORS_ACTORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFilmsFilmid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getActorsActorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFilmsFilmid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getActorsActorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmActorRecord value1(Integer value) {
        setFilmsFilmid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmActorRecord value2(Integer value) {
        setActorsActorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmActorRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmActorRecord
     */
    public FilmActorRecord() {
        super(FilmActor.FILM_ACTOR);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(Integer filmsFilmid, Integer actorsActorid) {
        super(FilmActor.FILM_ACTOR);

        set(0, filmsFilmid);
        set(1, actorsActorid);
    }
}
