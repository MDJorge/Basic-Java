public class Seat
{
	private Student student;
	
	/**
	 * The Seat is empty provided there is no student assigned to it!
	 * @return true if and only if student is null.
	 */
	public boolean isEmpty()
	{
		return student == null;
	}
	
	/**
	 * A seat in the recital hall is empty until a student is assigned to it
	 */
	public Seat()
	{
		this.Student = null;
	}
	
	/**
	 * Assign the given student to this seat.
	 * @param student the Student assigned to this seat.
	 */
	public void assignStudent(Student student)
	{
		this.student = student;
	}
	
	public Student getStudent()
	{
		return this.student;
	}
}	
public class Row
{
	private ArayList <Seat> seats;
	
	/**
	 * Create a new row filled with empty seats;
	 * @param length the number of seats in this row
	 */
	public Row(int length)
	{
		this.seats = new ArrayList<Seat>();
		for(int i = 0; i < length; i++)
		{
			this.seats.add(new Seat());
		}
	}
	
	/**
	 * Get the seat in the given position.
	 * IMPORTANT--this is the Index in the ArrayList,
	 * so 0 is the first spot, not 1~
	 * @param number index of Seat in the row.
	 */
	public void assignStudent(Student student, int seatNumber)
	{
		Seat seat = this.getSeat(seatNumber);
		seat.assignStudent(student);
		this.seats.set(seatNumber, seat);
	}
}