package toantt.example;

import java.util.Date;

public class Workflow {
	private Long id;
	private String name;
	private boolean status;
	private Date start;

	//get id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	private Date end;
	private Workflow link;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Workflow getLink() {
		return link;
	}

	public void setLink(Workflow link) {
		this.link = link;
	}

	/*
	 * This is a function to find a workflow by id
	 */
	private Workflow findWorkById(Long id) {
		
		return null;
	}
	
	/*
	 * This is a function to find a workflow by name
	 */
	private Workflow findWorkByName(String name) {
		
		return null;
	}
}
