/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class UUuidsRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.postgres.generatedclasses.udt.records.UUuidsRecord> {

	private static final long serialVersionUID = -995214197;


	/**
	 * Setter for <code>public.u_uuids.u1</code>. 
	 */
	public void setU1(java.util.UUID value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UUuids.U1, value);
	}

	/**
	 * Getter for <code>public.u_uuids.u1</code>. 
	 */
	public java.util.UUID getU1() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UUuids.U1);
	}

	/**
	 * Setter for <code>public.u_uuids.u2</code>. 
	 */
	public void setU2(java.util.UUID[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UUuids.U2, value);
	}

	/**
	 * Getter for <code>public.u_uuids.u2</code>. 
	 */
	public java.util.UUID[] getU2() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UUuids.U2);
	}

	/**
	 * Create a new <code>public.u_uuids</code> record
	 */
	public UUuidsRecord() {
		super(org.jooq.test.postgres.generatedclasses.udt.UUuids.U_UUIDS);
	}
}
