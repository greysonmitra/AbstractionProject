package abstraction.controller;

import java.util.ArrayList;
import abstraction.model.*;
import abstraction.view.*;

public class BasketballController
{
	private AbstractFrame baseFrame;
	private NBABasketballGame myNBAGame;
	private NCAABasketballGame myNCAAGame;
	private BasketballZach mySport;
	private NissanCar myCar;
	private ChapterBook myBook;
	
	public BasketballController()
	{
		this.coolThings = new ArrayList<CoolThing>();
		//build all model components   DONE?
		makeCoolList();
		//build view                   DONE?
		
		myNCAAGame = new NCAABasketballGame();
		myNBAGame = new NBABasketballGame();
		mySport = new BasketballZach();
		myCar = new NissanCar();
		myCar = new NissanCar();
		baseFrame = new AbstractFrame(this);
	}
	private ArrayList<CoolThing> coolThings;
	
	
	public String showCoolLevels()
	{
		String coolLevels = "";
		for(CoolThing currentCool : coolThings)
		{
			coolLevels += ("This is a " + currentCool.toString() + ", a cool level of " + currentCool.coolnessLevel()  + "\n");
		}
		
		return coolLevels;
	}
	
	private void makeCoolList()
	{
		coolThings.add(new NBABasketballGame());
		coolThings.add(new NCAABasketballGame());
		coolThings.add(new ChapterBook());
		coolThings.add(new NissanCar());
		coolThings.add(new BasketballZach());
	}
	
	public void start()
	{
		
	}
	
	public void swap(int firstLocation, int secondLocation)
	{
		CoolThing temp = coolThings.get(firstLocation);
		coolThings.set(firstLocation, coolThings.get(secondLocation));
		coolThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < coolThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (coolThings.get(innerLoop-1).compareTo(coolThings.get(innerLoop)) > 0))
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	
	public int partition(int low, int high)
	{
		int position = low;
		CoolThing pivot = coolThings.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(coolThings.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}
	
	public ArrayList<CoolThing> getCoolThings()
	{
		return coolThings;
	}

	public void setCoolThings(ArrayList<CoolThing> coolThings)
	{
		this.coolThings = coolThings;
	}

}
