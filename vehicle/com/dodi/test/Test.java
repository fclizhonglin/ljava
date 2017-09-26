package com.dodi.test;

import com.dodi.ab.Vehicle;
import com.dodi.cb.Car;
import com.dodi.cb.Plane;
import com.dodi.cb.Ship;
import com.dodi.cb.Train;
import com.dodi.train.Hightspeed;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car("汽车型","60km/h");
		Vehicle plane = new Plane("飞机型","500km/h");
		Vehicle train = new Train("长条型","80km/h");
		Vehicle ship = new Ship("轮船型","45km/h");
		Vehicle hs = new Hightspeed("子弹头","280km/h");
		car.moving();
		car.speedometer();
		
		plane.moving();
		plane.speedometer();
		train.moving();
		train.speedometer();
		ship.moving();
		ship.speedometer();
		hs.speedometer();
	}

}
