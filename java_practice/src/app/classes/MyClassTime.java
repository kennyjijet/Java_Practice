package app.classes;

import java.time.*;

import java.util.*;

public class MyClassTime {

    public class MyDateObject {
        int getDay;
        int getDate;
        String getDayName;

        public MyDateObject(int day, int date, String name) {
            this.getDate = date;
            this.getDay = day;
            this.getDayName = name;
        }

    }

    public LocalTime getNowDay() {

        LocalTime localTimeNow = LocalTime.now();
        return localTimeNow;
    }

    public List<MyDateObject> getAllDaysOfTheMonth(int year, int monthIndex) {
        List<MyDateObject> myDateObjList = new ArrayList<MyDateObject>();
        YearMonth yearMonthObject = YearMonth.of(year, monthIndex);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        // HashMap<String, String> capitalCities = new HashMap<String, String>();
        for (int dateIndex = 1; dateIndex <= daysInMonth; dateIndex++) {
            // DayOfWeek dayOfWeek = DayOfWeek.of((dateIndex % 7));
            LocalDate date = LocalDate.of(year, monthIndex, dateIndex);
            DayOfWeek dayOfWeek = DayOfWeek.from(date);
            MyDateObject myDateObj = new MyDateObject(dayOfWeek.getValue(), dateIndex, dayOfWeek.name());
            myDateObjList.add(myDateObj);
            System.out.println(dateIndex);
        }

        for (MyDateObject value : myDateObjList) {
            System.out.println(String.valueOf(value.getDate) + " " + String.valueOf(value.getDayName));
        }
        return myDateObjList;
    }
}

/*
 * 
 * 
 * 
 * /*
 * 
 * MyClassTime myClassTime = new MyClassTime();
 * myClassTime.getAllDaysOfTheMonth(2019, 11); // MyClass myClass = new
 * MyClass("test"); // MyClassVector myClassVector = new MyClassVector(50,
 * 41.56f); // myClassVector.printVectors(); // MyClassVector
 * copiedMyClassVector = myClassVector.copy(); //
 * copiedMyClassVector.setVectors(20.5f, 10.5f); //
 * copiedMyClassVector.printVectors(); MyClassForEroad myClassForEroad = new
 * MyClassForEroad(); myClassForEroad.print();
 * 
 * // ParentClass parentClass = new ParentClass(); // parentClass.print();
 * 
 * ChildClass parentClass = new ChildClass("Child"); parentClass.print();
 * 
 * 
 * //var date = new Date(year, monthIndex, 1); // dateOfBirth.plusDays() //
 * dateOfBirth.getDayOfWeek().getValue(); //
 * System.out.println(dt.getDayOfWeek().getValue()); // var result = []; //
 * tempDateOfBirth=dateOfBirth.plusDays(1); //
 * System.out.println(tempDateOfBirth); // LocalDate dateOfBirth =
 * LocalDate.of(year,monthIndex,1);**** // var date = new Date(year, monthIndex,
 * 1); // dateOfBirth.plusDays() // dateOfBirth.getDayOfWeek().getValue(); //
 * System.out.println(dt.getDayOfWeek().getValue()); // var result = []; //
 * tempDateOfBirth=dateOfBirth.plusDays(1); //
 * System.out.println(tempDateOfBirth); // LocalDate dateOfBirth =
 * LocalDate.of(year,monthIndex,1);System.out.println("Day of the Week - "+*
 * dayOfWeek.name());System.out.println("Int Value of "+dayOfWeek.name()+*" - "
 * +dayOfWeek.getValue());**while(dateOfBirth.getDayOfMonth()==monthIndex){ //
 * LocalDate // dateOfBirth =LocalDate.of(year,monthIndex,1);
 * 
 * MyDateObject myDateObject = new MyDateObject(dateOfBirth.getDayOfMonth(),
 * dateOfBirth.getDayOfWeek().getValue()); dateOfBirth =
 * dateOfBirth.plusDays(1); myDateObjList.add(myDateObject);
 * System.out.println(dateOfBirth); }
 */
/*
 * for (MyDateObject value : myDateObjList) { System.out.println(value.getDate);
 * System.out.println(value.getDay); }
 */

// System.out.println("Your Date of birth is : " + dateOfBirth);
// LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);