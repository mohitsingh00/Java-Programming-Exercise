package Streams;
import java.util.Arrays;
import java.util.List;
class Students
{
	String name;
	int score;
	
	Students(String n,int s)
	{
		name = n;
		score = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getScore()
	{
		return score;
	}
}
public class ParallelStream {

	public static void main(String[] args) {

		List<Students> stu = Arrays.asList(
				new Students("Dave",65),
				new Students("Mark",85),
				new Students("Kate",95),
				new Students("Greg",75),
				new Students("John",90));
		
		//Stream() -> sequential
		stu.stream().filter(s->s.getScore()>80)
					.limit(3)
					.forEach(s->System.out.println(s.name+"  "+s.score));
		
		System.out.println();
		
		//Parallel Stream
		stu.parallelStream().filter(s->s.getScore()>80)
							.limit(3)
							.forEach(s->System.out.println(s.name+"  "+s.score));
		
		System.out.println();
		
		//Converting stream into parallel stream
		stu.stream().parallel().filter(s->s.getScore()>80)
							   .limit(3)
							   .forEach(s->System.out.println(s.name+"  "+s.score));
	}
}
