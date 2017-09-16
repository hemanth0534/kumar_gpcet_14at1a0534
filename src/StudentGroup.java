import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
Student[] students = new Student[];
scanner sc =new scanner(system.in);
int s =sc.nextInt();
System.out.println("no of students"+s);
for(int i=0;i<=s;i++)
{

students[i].id =sc.nextInt();
students[i].fullname =sc.nextLine();
students[i].birthDate=sc.nextDate();
students[i].avgMark =sc.nextInt();
}

	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
                   int studentscount= students.length;
		return null;
                                     
	}

	@Override
	public void setStudents(Student[] students) {
                    if(studentscount==0)
                       {
                      throw new IllegalArgumentException("0 students");
                      }
	
	}

	@Override
	public Student getStudent(int index) {
                       if(index<0 || index>=studentscount)
{
throw new IllegalArgumentException("low index");
}

		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
  if(studentscount==0)
                       {
                      throw new IllegalArgumentException("0 students");
                      }
  if(index<0 || index>=studentscount)
{
throw new IllegalArgumentException("low index");
}
int n;
scanner sc=new scanner(system.in);

studentscount.set(0+n,"replace");
for(int index=0; index < arrayList.size(); index++)
      System.out.println(arrayList.get(index));

                  
	}

	@Override
	public void addFirst(Student student) {
 if(studentscount==0)
                       {
                      throw new IllegalArgumentException("0 students");
                      }
	else{
int n;
scanner sc=new scanner(system.in);

 studentscount.add(0,"n");
}
	
	}

	@Override
	public void addLast(Student student) {
int i;
students[] temp =new student[this.studentscount.length+1];
 for ( int i = 0; i<this.books.length; i++ )
        temp[i] = this.studenscount[i];
    this.studentcount = temp;
		
	}

	@Override
	public void add(Student student, int index) {
students[] temp =new student[this.studentscount.length+1];
studentscount.add(0,"n");

		
	}

	@Override
	public void remove(int index) {
		
    int origianl;
    System.studentscount(original, 0, n, 0, index );
    System.studentscount(original, index+1, n, index, original.length - index-1);
    return n;
}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
