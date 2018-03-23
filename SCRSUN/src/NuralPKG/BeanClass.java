package NuralPKG;

public class BeanClass {

	public BeanClass(String Name,String Total_Versions,String Latest_version,	String License,	String Author,String Maintainer ,
			String Programming_language ,String Memory_utilization,
			String Disk_utilization,String Operating_system, String Published_date, 	
			String Description,String Available_version,String Number_of_dependencies,
			String Dependencies ,String Source) {
		// TODO Auto-generated constructor stub
		
		this.Name = Name;
		this.Total_Versions = Total_Versions;
		this.Latest_version = Latest_version;
		this.License = License;
		this.Author = Author;
		this.Maintainer = Maintainer;
		this.Programming_language = Programming_language;
		this.Memory_utilization = Memory_utilization;
		this.Disk_utilization = Disk_utilization;
		this.Operating_system = Operating_system;
		this.Published_date = Published_date;
		this.Description = Description;
		this.Available_version = Available_version;
		this.Number_of_dependencies = Number_of_dependencies;
		this.Dependencies = Dependencies;
		this.Source = Source;
		
	}
	public String getName() {
		return Name;
	}

	public String getTotal_Versions() {
		return Total_Versions;
	}

	public String getLatest_version() {
		return Latest_version;
	}

	public String getLicense() {
		return License;
	}

	public String getAuthor() {
		return Author;
	}

	public String getMaintainer() {
		return Maintainer;
	}

	public String getProgramming_language() {
		return Programming_language;
	}

	public String getMemory_utilization() {
		return Memory_utilization;
	}

	public String getDisk_utilization() {
		return Disk_utilization;
	}

	public String getOperating_system() {
		return Operating_system;
	}

	public String getPublished_date() {
		return Published_date;
	}

	public String getDescription() {
		return Description;
	}

	public String getAvailable_version() {
		return Available_version;
	}

	public String getNumber_of_dependencies() {
		return Number_of_dependencies;
	}

	public String getDependencies() {
		return Dependencies;
	}

	public String getSource() {
		return Source;
	}

	String Name,Total_Versions,Latest_version,	License,	Author,Maintainer , Programming_language , Memory_utilization,
			Disk_utilization,Operating_system, Published_date, 	Description,Available_version,Number_of_dependencies,
			Dependencies , Source;
}
