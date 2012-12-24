package org.zkoss.tutorial2012.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.zkoss.tutorial2012.services.CommonInfoService.Priority;

public class CommonInfoService {

	static List<String> countryList = new ArrayList<String>();
	static{
		countryList.add("Afghanistan");
		countryList.add("Aland Islands");
		countryList.add("Albania");
		countryList.add("Algeria");
		countryList.add("American Samoa");
		countryList.add("Andorra");
		countryList.add("Angola");
		countryList.add("Anguilla");
		countryList.add("Antarctica");
		countryList.add("Antigua and Barbuda");
		countryList.add("Argentina");
		countryList.add("Armenia");
		countryList.add("Aruba");
		countryList.add("Australia");
		countryList.add("Austria");
		countryList.add("Azerbaijan");
		countryList.add("Bahamas");
		countryList.add("Bahrain");
		countryList.add("Bangladesh");
		countryList.add("Barbados");
		countryList.add("Belarus");
		countryList.add("Belgium");
		countryList.add("Belize");
		countryList.add("Benin");
		countryList.add("Bermuda");
		countryList.add("Bhutan");
		countryList.add("Bolivia");
		countryList.add("Bosnia and Herzegovina");
		countryList.add("Botswana");
		countryList.add("Bouvet Island");
		countryList.add("Brazil");
		countryList.add("British Indian Ocean Territory");
		countryList.add("British Virgin Islands");
		countryList.add("Brunei");
		countryList.add("Bulgaria");
		countryList.add("Burkina Faso");
		countryList.add("Burundi");
		countryList.add("Cambodia");
		countryList.add("Cameroon");
		countryList.add("Canada");
		countryList.add("Cape Verde");
		countryList.add("Cayman Islands");
		countryList.add("Central African Republic");
		countryList.add("Chad");
		countryList.add("Chile");
		countryList.add("China");
		countryList.add("Christmas Island");
		countryList.add("Cocos (Keeling) Islands");
		countryList.add("Colombia");
		countryList.add("Comoros");
		countryList.add("Congo");
		countryList.add("Cook Islands");
		countryList.add("Costa Rica");
		countryList.add("Croatia");
		countryList.add("Cuba");
		countryList.add("Cyprus");
		countryList.add("Czech Republic");
		countryList.add("Democratic Republic of Congo");
		countryList.add("Denmark");
		countryList.add("Disputed Territory");
		countryList.add("Djibouti");
		countryList.add("Dominica");
		countryList.add("Dominican Republic");
		countryList.add("East Timor");
		countryList.add("Ecuador");
		countryList.add("Egypt");
		countryList.add("El Salvador");
		countryList.add("Equatorial Guinea");
		countryList.add("Eritrea");
		countryList.add("Estonia");
		countryList.add("Ethiopia");
		countryList.add("Falkland Islands");
		countryList.add("Faroe Islands");
		countryList.add("Federated States of Micronesia");
		countryList.add("Fiji");
		countryList.add("Finland");
		countryList.add("France");
		countryList.add("French Guyana");
		countryList.add("French Polynesia");
		countryList.add("French Southern Territories");
		countryList.add("Gabon");
		countryList.add("Gambia");
		countryList.add("Georgia");
		countryList.add("Germany");
		countryList.add("Ghana");
		countryList.add("Gibraltar");
		countryList.add("Greece");
		countryList.add("Greenland");
		countryList.add("Grenada");
		countryList.add("Guadeloupe");
		countryList.add("Guam");
		countryList.add("Guatemala");
		countryList.add("Guinea");
		countryList.add("Guinea-Bissau");
		countryList.add("Guyana");
		countryList.add("Haiti");
		countryList.add("Heard Island and Mcdonald Islands");
		countryList.add("Honduras");
		countryList.add("Hong Kong");
		countryList.add("Hungary");
		countryList.add("Iceland");
		countryList.add("India");
		countryList.add("Indonesia");
		countryList.add("Iran");
		countryList.add("Iraq");
		countryList.add("Iraq-Saudi Arabia Neutral Zone");
		countryList.add("Ireland");
		countryList.add("Israel");
		countryList.add("Italy");
		countryList.add("Ivory Coast");
		countryList.add("Jamaica");
		countryList.add("Japan");
		countryList.add("Jordan");
		countryList.add("Kazakhstan");
		countryList.add("Kenya");
		countryList.add("Kiribati");
		countryList.add("Kuwait");
		countryList.add("Kyrgyzstan");
		countryList.add("Laos");
		countryList.add("Latvia");
		countryList.add("Lebanon");
		countryList.add("Lesotho");
		countryList.add("Liberia");
		countryList.add("Libya");
		countryList.add("Liechtenstein");
		countryList.add("Lithuania");
		countryList.add("Luxembourg");
		countryList.add("Macau");
		countryList.add("Macedonia");
		countryList.add("Madagascar");
		countryList.add("Malawi");
		countryList.add("Malaysia");
		countryList.add("Maldives");
		countryList.add("Mali");
		countryList.add("Malta");
		countryList.add("Marshall Islands");
		countryList.add("Martinique");
		countryList.add("Mauritania");
		countryList.add("Mauritius");
		countryList.add("Mayotte");
		countryList.add("Mexico");
		countryList.add("Moldova");
		countryList.add("Monaco");
		countryList.add("Mongolia");
		countryList.add("Montserrat");
		countryList.add("Morocco");
		countryList.add("Mozambique");
		countryList.add("Myanmar");
		countryList.add("Namibia");
		countryList.add("Nauru");
		countryList.add("Nepal");
		countryList.add("Netherlands");
		countryList.add("Netherlands Antilles");
		countryList.add("New Caledonia");
		countryList.add("New Zealand");
		countryList.add("Nicaragua");
		countryList.add("Niger");
		countryList.add("Nigeria");
		countryList.add("Niue");
		countryList.add("Norfolk Island");
		countryList.add("North Korea");
		countryList.add("Northern Mariana Islands");
		countryList.add("Norway");
		countryList.add("Oman");
		countryList.add("Pakistan");
		countryList.add("Palau");
		countryList.add("Palestinian Territories");
		countryList.add("Panama");
		countryList.add("Papua New Guinea");
		countryList.add("Paraguay");
		countryList.add("Peru");
		countryList.add("Philippines");
		countryList.add("Pitcairn Islands");
		countryList.add("Poland");
		countryList.add("Portugal");
		countryList.add("Puerto Rico");
		countryList.add("Qatar");
		countryList.add("Reunion");
		countryList.add("Romania");
		countryList.add("Russia");
		countryList.add("Rwanda");
		countryList.add("Saint Helena and Dependencies");
		countryList.add("Saint Kitts and Nevis");
		countryList.add("Saint Lucia");
		countryList.add("Saint Pierre and Miquelon");
		countryList.add("Saint Vincent and the Grenadines");
		countryList.add("Samoa");
		countryList.add("San Marino");
		countryList.add("Sao Tome and Principe");
		countryList.add("Saudi Arabia");
		countryList.add("Senegal");
		countryList.add("Seychelles");
		countryList.add("Sierra Leone");
		countryList.add("Singapore");
		countryList.add("Slovakia");
		countryList.add("Slovenia");
		countryList.add("Solomon Islands");
		countryList.add("Somalia");
		countryList.add("South Africa");
		countryList.add("South Georgia and South Sandwich Islands");
		countryList.add("South Korea");
		countryList.add("Spain");
		countryList.add("Spratly Islands");
		countryList.add("Sri Lanka");
		countryList.add("Sudan");
		countryList.add("Suriname");
		countryList.add("Svalbard and Jan Mayen");
		countryList.add("Swaziland");
		countryList.add("Sweden");
		countryList.add("Switzerland");
		countryList.add("Syria");
		countryList.add("Taiwan");
		countryList.add("Tajikistan");
		countryList.add("Tanzania");
		countryList.add("Thailand");
		countryList.add("Togo");
		countryList.add("Tokelau");
		countryList.add("Tonga");
		countryList.add("Trinidad and Tobago");
		countryList.add("Tunisia");
		countryList.add("Turkey");
		countryList.add("Turkmenistan");
		countryList.add("Turks And Caicos Islands");
		countryList.add("Tuvalu");
		countryList.add("Uganda");
		countryList.add("Ukraine");
		countryList.add("United Arab Emirates");
		countryList.add("United Kingdom");
		countryList.add("United States");
		countryList.add("Uruguay");
		countryList.add("US Virgin Islands");
		countryList.add("Uzbekistan");
		countryList.add("Vanuatu");
		countryList.add("Vatican City");
		countryList.add("Venezuela");
		countryList.add("Vietnam");
		countryList.add("Wallis and Futuna");
		countryList.add("Western Sahara");
		countryList.add("Yemen");
		countryList.add("Zambia");
		countryList.add("Zimbabwe");
		countryList.add("Serbia");
		countryList.add("Montenegro");
		countryList = Collections.unmodifiableList(countryList);
	}
	
	public static List<String> getCountryList() {
		return countryList;
	}

	
	public static class Priority {
		int priority;
		String label;
		public Priority(int priority,String label){
			this.priority = priority;
			this.label = label;
		}
		public int getPriority() {
			return priority;
		}
		public String getLabel() {
			return label;
		}
	}
	static List<Priority> priorityList = new ArrayList<Priority>();
	static{
		priorityList.add(new Priority(0,"High"));
		priorityList.add(new Priority(1,"Medium"));
		priorityList.add(new Priority(2,"Low"));
		priorityList = Collections.unmodifiableList(priorityList);
	}
	public static List<Priority> getPriorityList() {
		return priorityList;
	}
	public static Priority getPriority(int priority) {
		for(Priority p:priorityList){
			if(priority == p.priority)
				return p;
		}
		return priorityList.get(priorityList.size()-1);
	}
}
