package io.rscale.training.company;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.UUID;

@Entity
public class Company {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	
	@NotEmpty
	private String name;
	private String[] aliases;
	
	private String website;
	private String twitter;
	
	Company() {}

	public Company(String name, String[] aliases, String website, String twitter) {
		super();
		this.name = name;
		this.aliases = aliases;
		this.website = website;
		this.twitter = twitter;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAliases() {
		return aliases;
	}

	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", aliases=" + Arrays.toString(aliases) + ", website=" + website
				+ ", twitter=" + twitter + "]";
	}
	
	
}
