package ua.com.qalight;

import java.util.logging.Logger;

import ua.com.qalight.circle.Circle;
import ua.com.qalight.square.Square;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	
	private static int main1(int radius, int area) {

		logger.info("(Once) Circle with radius " + radius + " has area " + area);
		return (int)(radius*radius*Math.PI);
		
	}

	
	public static void main(String[] args) {
		Square square = new Square(10);
		logger.info("Square with side " + square.getSide() + " has area " + square.getArea());

		Circle circle = new Circle(15);
		logger.info("(Twice) Circle with radius " + circle.getRadius() + " has area " + main1(circle.getRadius(), circle.getArea()));

	}

}
