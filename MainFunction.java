import java.util.Vector;

public class MainFunction
{

	static int rabName = 0; // ��������
	public static void main(String[] args)
	{
		// ��ʼ���
		Rabbit r1 = new Rabbit();
		Rabbit r2 = new Rabbit();
		r1.name = rabName++;
		r2.name = rabName++;
		r1.age = 1;
		r2.age = 1;

		// װ�����е�����
		Vector<Rabbit> rab = new Vector<Rabbit>();
		rab.addElement(r1);
		rab.addElement(r2);
		printCurrentRabbit(rab); // ��ӡ�������е�����

		while (true)
		{
			for (int i = 0; i < rab.size(); i++)
			{
				// ������������
				rab.get(i).age++;
				
				// ���������¾Ϳ���������
				if (rab.get(i).age >= 3)
				{
					addRabbit(rab);
				}
				
				
			}
			printCurrentRabbit(rab); // ��ӡ�������е�����
			
			//����ѭ��
			if (rab.get(0).age == 4)
			{
				break;
			}
		}
		

	}

	//�����ӵĺ���
	public static void addRabbit(Vector<Rabbit> rab)
	{
		Rabbit r1 = new Rabbit();
		r1.name = rabName++;
		r1.age = 0;
		rab.addElement(r1);

	}

	//��ӡ���ڴ��ڵ�����
	public static void printCurrentRabbit(Vector<Rabbit> rab)
	{
		System.out.println("��" + rab.get(0).age + "���£�");
		for (int i = 0; i < rab.size(); i++)
		{
			
			System.out.println(i + "������ ��" + "  " + rab.get(i).name + "�����ӵ�����Ϊ �� "
					+ rab.get(i).age);
		}
	}

}
