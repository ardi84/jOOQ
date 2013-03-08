/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TDates implements java.io.Serializable {

	private static final long serialVersionUID = -1346074896;

	private final java.lang.Integer  id;
	private final java.sql.Date      d;
	private final java.sql.Time      t;
	private final java.sql.Timestamp ts;
	private final java.lang.Integer  dInt;
	private final java.lang.Long     tsBigint;

	public TDates(
		java.lang.Integer  id,
		java.sql.Date      d,
		java.sql.Time      t,
		java.sql.Timestamp ts,
		java.lang.Integer  dInt,
		java.lang.Long     tsBigint
	) {
		this.id = id;
		this.d = d;
		this.t = t;
		this.ts = ts;
		this.dInt = dInt;
		this.tsBigint = tsBigint;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public java.sql.Date getD() {
		return this.d;
	}

	public java.sql.Time getT() {
		return this.t;
	}

	public java.sql.Timestamp getTs() {
		return this.ts;
	}

	public java.lang.Integer getDInt() {
		return this.dInt;
	}

	public java.lang.Long getTsBigint() {
		return this.tsBigint;
	}
}
