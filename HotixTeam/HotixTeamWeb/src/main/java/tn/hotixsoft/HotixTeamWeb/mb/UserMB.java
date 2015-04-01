package tn.hotixsoft.HotixTeamWeb.mb;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.hotixsoft.HotixTeamEJB.entities.Administrator;
import tn.hotixsoft.HotixTeamEJB.entities.Branch;
import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.EmpGp;
import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.EmployeeBranch;
import tn.hotixsoft.HotixTeamEJB.entities.Groupe;
import tn.hotixsoft.HotixTeamEJB.entities.User;
import tn.hotixsoft.HotixTeamEJB.interfaces.IEmpGpLocal;
import tn.hotixsoft.HotixTeamEJB.interfaces.IUserLocal;

@ManagedBean(name = "UserMB")
@SessionScoped
public class UserMB {
	@EJB
	private IUserLocal iUserLocal;

	@EJB
	private IEmpGpLocal me;

	private String UserName;
	private String PassWord;
	private String Email;
	private String FirstName;
	private String LastName;
	private int Phone;
	private String Cin;
	private Employee employee;
	private List<Employee> employees;
	private Groupe groupe;
	private List<Groupe> selectedGroup;
	private User user = new User();
	private String Adresse;
	private String RaisonSociale;
	private String Fax;
	private boolean Father;
	private Client ClientFather;
	private List<Client> ClientsF;
	private List<Client> Clients;
	private String titleBranch;
	private List<Branch> selectedBranch;
	private List<Branch> Branchs;

	public List<Client> FindAllClientsF() {
		return iUserLocal.findAllClientFather();
	}

	public List<Client> FindAllClient() {
		return iUserLocal.findAllClient();
	}

	@PostConstruct
	public void init() {
		setClients(FindAllClient());
	}

	public void AjouterEmployee() {
		Employee employee = new Employee(Email, UserName, PassWord, Phone, Cin,
				FirstName, LastName);
		iUserLocal.AddEmployee(employee);

		FirstName = null;
		LastName = null;
		Email = null;
		UserName = null;
		PassWord = null;
		Phone = 0;
		Cin = null;

		for (Groupe g : selectedGroup) {
			me.AddEmpGp(new EmpGp(employee, g));
			System.out.println(g);
		}
		for (Branch b : selectedBranch) {
			iUserLocal.addEmployeeBranch(new EmployeeBranch(employee, b));
			System.out.println(b);
		}

	}

	public void AjouterClient() {
		iUserLocal.AddClient(new Client(Email, UserName, PassWord, Phone,
				Adresse, RaisonSociale, Father, Fax, ClientFather));
		Email = null;
		UserName = null;
		PassWord = null;
		Phone = 0;
		Adresse = null;
		RaisonSociale = null;
		Fax = null;
		// Father=null;
		ClientFather = null;

	}

	public void addBranchM() {
		iUserLocal.addBranch(new Branch(titleBranch));
		titleBranch = null;
	}

	public void test() {

		user = iUserLocal.Login(UserName, PassWord);

		if (user instanceof Administrator) {
			System.out.println("succes, redirection....");

			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("TestWeb.jsf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("succes, redirection....");

			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("TestWeb.jsf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println(" Authentification Failed....");

		// managementRemote.test();
	}

	public List<Employee> FindAllEmployee() {
		return iUserLocal.findAllEmployee();
	}

	public List<Branch> findAllBranch() {
		return iUserLocal.findBranch();
	}

	@PostConstruct
	public void chercher() {
		setEmployees(FindAllEmployee());
		setClientsF(FindAllClientsF());
		// setClients(FindAllClient());
		setBranchs(findAllBranch());
	}

	public List<Branch> getBranchs() {
		return Branchs;
	}

	public void setBranchs(List<Branch> branchs) {
		Branchs = branchs;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getCin() {
		return Cin;
	}

	public void setCin(String cin) {
		Cin = cin;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public List<Groupe> getSelectedGroup() {
		return selectedGroup;
	}

	public void setSelectedGroup(List<Groupe> selectedGroup) {
		this.selectedGroup = selectedGroup;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getRaisonSociale() {
		return RaisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		RaisonSociale = raisonSociale;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public boolean isFather() {
		return Father;
	}

	public void setFather(boolean father) {
		Father = father;
	}

	public Client getClientFather() {
		return ClientFather;
	}

	public void setClientFather(Client clientFather) {
		ClientFather = clientFather;
	}

	public List<Client> getClientsF() {
		return ClientsF;
	}

	public void setClientsF(List<Client> clientsF) {
		ClientsF = clientsF;
	}

	public List<Client> getClients() {
		return Clients;
	}

	public void setClients(List<Client> clients) {
		Clients = clients;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getTitleBranch() {
		return titleBranch;
	}

	public void setTitleBranch(String titleBranch) {
		this.titleBranch = titleBranch;
	}

	public List<Branch> getSelectedBranch() {
		return selectedBranch;
	}

	public void setSelectedBranch(List<Branch> selectedBranch) {
		this.selectedBranch = selectedBranch;
	}

}
