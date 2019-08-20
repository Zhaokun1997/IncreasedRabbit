import java.util.Vector;

public class MainFunction
{

	static int rabName = 0; // 兔子名字
	public static void main(String[] args)
	{
		// 初始格局
		Rabbit r1 = new Rabbit();
		Rabbit r2 = new Rabbit();
		r1.name = rabName++;
		r2.name = rabName++;
		r1.age = 1;
		r2.age = 1;

		// 装入现有的兔子
		Vector<Rabbit> rab = new Vector<Rabbit>();
		rab.addElement(r1);
		rab.addElement(r2);
		printCurrentRabbit(rab); // 打印出来现有的兔子

		while (true)
		{
			for (int i = 0; i < rab.size(); i++)
			{
				// 兔子年龄增长
				rab.get(i).age++;
				
				// 超过三个月就可以生孩子
				if (rab.get(i).age >= 3)
				{
					addRabbit(rab);
				}
				
				
			}
			printCurrentRabbit(rab); // 打印出来现有的兔子
			
			//跳出循环
			if (rab.get(0).age == 4)
			{
				break;
			}
		}
		

	}

	//生兔子的孩子
	public static void addRabbit(Vector<Rabbit> rab)
	{
		Rabbit r1 = new Rabbit();
		r1.name = rabName++;
		r1.age = 0;
		rab.addElement(r1);

	}

	//打印现在存在的兔子
	public static void printCurrentRabbit(Vector<Rabbit> rab)
	{
		System.out.println("第" + rab.get(0).age + "个月：");
		for (int i = 0; i < rab.size(); i++)
		{
			
			System.out.println(i + "号兔子 ：" + "  " + rab.get(i).name + "此兔子的年龄为 ： "
					+ rab.get(i).age);
		}
	}

}
