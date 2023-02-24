package com.xworkz.valantineValidation.entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.NamedQuery;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@Data
	@Table(name = "forestinfo")
	@AllArgsConstructor
	@NoArgsConstructor
	@NamedQuery(name = "findAreaByName", query = "select entity.area from ForestEntity entity where entity.name='Nallamala'")
	@NamedQuery(name = "findByName", query = "select dp from ForestEntity dp where dp.name='gir forest'")
	@NamedQuery(name = "findByState", query = "select entity from ForestEntity entity where entity.state='Gujurata'")
	@NamedQuery(name = "findByNameAndStateAndArea", query = "select en from ForestEntity en where en.name='Kukiral'and en.state='Odissa'and en.area='23654'")
	@NamedQuery(name = "findByNameAndState", query = "select bt from ForestEntity bt where bt.name='Nagarahole'and bt.state='Karnataka'")
	@NamedQuery(name = "findNameById", query = "select beg.name from ForestEntity beg where beg.id='10'")
	@NamedQuery(name = "findStateByNameAndArea", query = "select en.state from ForestEntity en where en.name='Annekaal'and en.area='14527'")
	@NamedQuery(name = "findCount", query = "select count (en) from ForestEntity en")
	@NamedQuery(name = "findMaxArea", query = "select max (db.area) from ForestEntity db")
	public class ForestEntity {
		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "name")
		private String name;
		@Column(name = "state")
		private String state;
		@Column(name = "type")
		private String type;
		@Column(name = "area")
		private Double area;
	}

