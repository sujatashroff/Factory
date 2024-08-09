Factory is a creational design pattern since it creates objects.

We use this pattern when we need to create instance of any one type of class. The class type is determined by input given.

I have used for creating different types of Employees , i.e. Regular/On Payroll or Contract Employee or Agent.

We need to create any one type of employee by giving different input. 

Factory pattern needs to have 

1. Type of Super Class /Interface  - This can be normal class or Abstract Class or Interface. In my case this is Employee which is Interface.

2. Generally Super class/Interface  has method which is different in each sub type - in my case it is getSalaryType().

3. Better to have some method in the Super Class/Interface  that will print distinguishing feature of each sub type.

4. Types of Sub Classes - We have one concrete class for each sub type i.e. Payroll_Emp, Contract_Emp, Agent.

5. Each of Sub Class extends or Implements Super Class/Interface.

6. Each sub class has member whic is distinguishing feature and its getter method.

7. Each Sub class has constructor which assigns/setter method for distinguishing feature.

8. We have one Factory class. In my case it is EmployeeFactory class.

9. Factory class has one static method getInstance() so that no need to create Factory class.

10. This method getInstance has inputs based on which new sub class will be created. In my case , it is empType and salaryType both of which are String.

11. We need to check if empType == "Payroll_Emp" then the sub class Payroll_Emp must be instantiated with appropriate parameter. This sub class is returned by the method.


