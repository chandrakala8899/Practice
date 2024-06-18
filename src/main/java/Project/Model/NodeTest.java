package Project.Model;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {
    public static void main(String[] args) {

       Node divisionFinance = new Node();
        divisionFinance.key = "Division";
        divisionFinance.label = "Finance";

       List<Node> childOfDivisionFinance = new ArrayList<>();

       Node generalFinance = new Node();
       generalFinance.key="Department";
       generalFinance.label="GeneralFinance";

       Node procurement = new Node();
        procurement.key="Department";
        procurement.label="Procurement";

        Node payRoll = new Node();
        payRoll.key="Department";
        payRoll.label="PayRoll";


        childOfDivisionFinance.add(generalFinance);
        childOfDivisionFinance.add(procurement);
        childOfDivisionFinance.add(payRoll);
        divisionFinance.children = childOfDivisionFinance;

        List<Node> childOfDepartmentProcurement = new ArrayList<>();

        Node procurementManager = new Node();
        procurementManager.key="Designation";
        procurementManager.label="ProcurementManager";

        Node executiveProcurementManager = new Node();
        executiveProcurementManager.key = "Designation";
        executiveProcurementManager.label = "ExecutiveProcurementManager";

        Node procurementExecutive = new Node();
        procurementExecutive.key = "Designation";
        procurementExecutive.label = "ProcurementExecutive";

        Node storeKeeper = new Node();
        storeKeeper.key = "Designation";
        storeKeeper.label = "StoreKeeper";

        childOfDepartmentProcurement.add(procurementManager);
        childOfDepartmentProcurement.add(executiveProcurementManager);
        childOfDepartmentProcurement.add(procurementExecutive);
        childOfDepartmentProcurement.add(storeKeeper);
        procurement.children=childOfDepartmentProcurement;

        List<Node> childOfDepartmentPayRoll = new ArrayList<>();
         Node payRollExecutive = new Node();
         payRollExecutive.key = "Designation";
         payRollExecutive .label = "PayrollExecutive";

         childOfDepartmentPayRoll.add(payRollExecutive);
         payRoll.children = childOfDepartmentPayRoll;

        List<Node> childOfDeparmentGeneralFinance = new ArrayList<>();

        Node directorOfFinance = new Node();
        directorOfFinance.key = "Designation";
        directorOfFinance.label = "Director Of Finance";

        Node assistantDirectorOfFinanace = new Node();
        assistantDirectorOfFinanace.key = "Designation";
        assistantDirectorOfFinanace.label = "AssistantDirectorOfFinanace";

        Node chiefAccountant = new Node();
        chiefAccountant.key ="Designation";
        chiefAccountant.label = "chiefAccountant";

        Node costController = new Node();
        costController.key = "Designation";
        costController.label = "costController";

        Node incomeAuditor = new Node();
        incomeAuditor.key = "Designation";
        incomeAuditor.label= "incomeAuditor";

        Node generalCashier = new Node();
        generalCashier.key = "Designation";
        generalCashier.label = "generalCashier";

        Node financeExecutiveAccountsPayable = new Node();
        financeExecutiveAccountsPayable.key = "Designation";
        financeExecutiveAccountsPayable.label = "financeExecutiveAccountsPayable";

        Node financeExecutiveAccountsReceivable = new Node();
        financeExecutiveAccountsReceivable.key= "Designation";
        financeExecutiveAccountsReceivable.label = "financeExecutiveAccountsReceivable";

        childOfDeparmentGeneralFinance.add(directorOfFinance);
        childOfDeparmentGeneralFinance.add(assistantDirectorOfFinanace);
        childOfDeparmentGeneralFinance.add(chiefAccountant);
        childOfDeparmentGeneralFinance.add(costController);
        childOfDeparmentGeneralFinance.add(incomeAuditor);
        childOfDeparmentGeneralFinance.add(generalCashier);
        childOfDeparmentGeneralFinance.add(financeExecutiveAccountsPayable);
        childOfDeparmentGeneralFinance.add(financeExecutiveAccountsReceivable);
        generalFinance.children = childOfDeparmentGeneralFinance;

        System.out.println(divisionFinance);



    }

}
