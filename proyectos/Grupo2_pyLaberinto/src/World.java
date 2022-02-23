package src;

public class World{
    static int[][] maze = {
            {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,5,5,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,4,4,3,3,3,3,3,3,3,2,2,3,3,3,3,3,3,11,11,11,11,11,11,11,2,2,2,11,11,11,11,11,5,5,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,2,4,4,3,3,3,3,3,3,2,2,2,3,3,3,3,2,7,11,11,11,11,11,11,11,7,7,7,11,11,11,11,5,5,5,5,3,3,3,3,3,7,7,4,3,3,3,3,3,3,3,7,7,3,3,3,3,9,9,3,3,3,3,3,3,3,3,2,3,2,2,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,4,4,4,3,3,3,3,3,2,2,3,3,3,3,9,9,7,7,11,11,11,11,11,11,7,7,7,11,11,11,5,5,5,5,5,5,3,3,3,7,7,7,4,4,3,3,3,3,7,7,7,7,3,3,3,7,4,7,9,2,9,3,3,3,3,2,2,2,2,2,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,9,4,4,3,3,3,3,3,3,3,3,3,3,3,4,4,7,7,7,11,11,11,11,11,2,7,7,11,11,11,11,11,11,11,11,11,11,11,11,7,7,7,7,4,4,3,4,4,4,7,7,7,3,3,3,9,9,7,7,9,9,3,3,3,3,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,9,9,9,9,2,4,3,3,3,3,3,3,3,3,3,4,2,4,7,7,7,2,11,11,11,11,11,7,7,2,11,11,11,11,11,11,11,11,11,11,11,7,9,7,7,2,4,4,4,4,7,7,7,7,3,1,2,9,7,1,7,9,9,2,3,3,3,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,9,4,9,2,4,4,3,3,3,3,3,3,3,4,4,2,4,7,7,9,7,11,11,11,11,11,2,7,2,11,11,11,11,11,11,11,11,11,11,11,2,7,9,7,7,4,4,4,7,7,7,7,7,3,1,7,7,7,1,9,9,7,7,3,3,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,3,3,3,2,2,2,9,2,2,2,2,2,2,4,4,9,2,4,4,5,5,2,2,2,11,11,11,11,11,11,11,11,3,3,3,3,3,2,2,2,2,2,1,1,1,1,1,1,1,1,11,11,11,1,1,1,1,1,1,1,5,5,5,5,5,5,5,3,3,3,3},
			{5,5,3,3,3,3,3,2,7,2,2,2,2,3,3,3,2,2,2,9,2,2,7,2,2,2,2,2,9,2,2,2,2,2,2,2,2,3,3,11,11,11,11,3,11,3,3,3,3,3,3,2,2,2,2,1,6,6,6,6,6,6,6,11,11,11,6,6,6,6,6,6,1,5,5,5,5,5,5,5,3,3,3,3},
			{5,5,5,3,3,3,3,2,7,7,2,2,2,3,3,3,2,2,9,9,9,7,7,7,2,2,2,2,2,2,9,2,2,2,2,2,2,3,3,11,11,11,11,3,3,3,3,3,3,3,3,2,2,2,2,1,2,11,2,11,11,11,9,11,11,11,2,2,2,5,5,6,1,5,5,7,5,5,5,11,11,11,11,11},
			{5,5,5,5,5,3,3,2,7,7,2,2,2,2,3,3,1,9,9,7,9,9,7,2,2,2,2,2,2,9,9,9,9,9,7,2,2,3,3,11,11,11,11,3,3,3,3,3,3,3,3,2,2,2,2,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,5,7,7,11,11,11,11,11,11,11,11},
			{5,5,5,5,5,3,3,7,7,7,2,2,2,2,2,9,11,11,11,7,7,9,5,5,5,2,2,2,2,7,7,9,9,7,7,2,2,3,3,3,3,3,3,3,3,3,11,11,11,3,3,2,2,2,2,1,6,2,2,11,11,11,9,11,2,2,11,2,2,7,2,2,1,2,2,7,11,11,11,11,11,11,11,11},
			{5,5,5,5,5,5,3,7,7,7,7,2,2,2,2,9,11,11,11,7,7,7,7,7,5,5,2,2,2,9,9,7,9,7,2,2,2,3,3,3,11,3,11,3,3,3,11,11,11,11,3,2,2,2,2,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,2,2,11,11,11,11,11,11,11,11,11},
			{5,5,5,5,5,5,5,7,7,7,7,2,2,2,2,9,11,11,11,11,7,5,5,5,5,5,2,2,2,9,7,7,7,7,2,2,3,3,3,3,11,11,3,3,3,3,11,11,11,11,3,2,2,2,2,1,4,9,11,2,2,11,2,2,11,11,11,2,2,11,7,6,1,2,2,11,11,11,11,11,11,11,11,11},
			{5,5,5,5,5,5,5,5,7,7,7,7,2,2,11,11,11,11,11,11,7,5,7,5,5,7,2,2,2,9,7,7,7,7,2,2,3,3,3,3,11,11,11,11,3,3,3,3,2,3,3,2,2,2,2,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,2,2,11,11,11,11,11,11,11,11,11},
			{5,5,5,5,5,5,5,5,5,7,7,2,2,11,11,11,11,11,11,11,7,5,5,5,7,2,2,2,2,2,9,9,7,7,2,2,3,3,3,3,11,11,11,11,3,3,3,3,2,3,3,2,2,2,2,1,6,9,11,11,11,2,11,11,11,11,11,2,2,7,7,2,1,2,2,11,11,11,11,11,11,11,11,11},
			{5,5,5,5,5,5,5,5,5,5,2,2,11,11,11,11,11,11,11,11,7,5,5,7,7,2,2,2,2,2,2,9,7,7,2,2,3,3,3,3,11,11,3,3,3,3,3,3,3,3,3,2,2,2,2,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,2,2,11,11,11,11,11,11,11,11,11},
			{5,5,5,5,5,5,5,5,5,5,11,11,11,11,11,11,11,11,11,11,2,2,2,2,2,2,2,2,2,2,2,2,9,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,2,2,2,1,6,5,11,11,11,11,11,11,11,11,11,2,2,7,2,6,1,4,4,11,11,11,9,11,11,11,11,11},
			{5,5,5,5,5,5,5,5,5,4,11,11,11,11,11,11,11,11,11,11,2,2,2,2,2,2,2,2,2,2,2,2,9,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,2,2,2,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,9,9,11,11,9,4,4,4,4,4,4},
			{5,5,5,5,5,5,5,5,4,11,11,11,11,11,9,9,11,11,11,11,2,2,2,2,2,2,2,2,2,2,2,2,9,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,1,1,1,1,1,6,11,11,5,5,5,6,1,1,1,1,1,1,9,2,11,11,9,4,3,3,3,3,3},
			{5,5,5,5,5,5,4,4,4,4,11,11,11,11,9,9,11,11,11,11,2,2,2,2,2,2,2,2,2,2,2,2,2,2,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,2,2,4,9,5,1,6,6,6,6,6,6,6,1,2,11,11,2,4,9,2,11,11,9,3,3,3,3,3,3},
			{5,5,5,5,5,5,4,4,4,4,11,11,11,11,9,9,11,11,11,11,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,2,2,4,9,5,5,1,1,6,6,1,1,1,1,2,11,11,4,4,2,2,11,9,9,3,3,3,3,3,3},
			{5,5,5,5,5,4,4,4,7,2,11,11,11,11,11,11,11,11,11,11,2,7,7,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,4,9,5,5,11,1,11,5,1,11,5,5,11,11,11,11,4,9,2,11,9,4,3,3,3,3,3,3},
			{5,5,5,5,5,4,4,7,7,9,7,2,11,11,11,11,11,11,11,11,11,7,7,7,2,2,2,2,2,2,2,2,2,3,3,3,7,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,4,9,5,5,11,11,11,5,11,5,5,5,5,11,11,11,9,2,11,11,9,4,3,3,3,3,3,3},
			{5,5,5,5,5,4,4,9,7,9,7,2,11,11,11,11,11,11,11,7,11,11,7,7,7,2,2,2,2,2,2,2,2,3,3,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,5,5,5,5,11,11,11,5,5,5,5,5,5,5,11,11,9,11,11,11,9,5,5,5,3,3,3,3},
			{5,5,5,5,4,4,9,9,7,7,7,7,9,4,11,11,11,11,11,7,7,7,7,7,7,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,3,3,3,1,1,1,1,1,1,1,5,5,11,11,5,5,5,5,5,5,5,5,11,4,11,11,5,5,5,9,5,5,3,3,3},
			{3,3,3,3,3,3,3,7,9,7,7,1,1,1,1,7,11,7,2,2,2,2,1,6,6,1,2,1,6,6,1,7,7,3,7,7,2,3,3,3,3,3,3,3,3,3,3,3,2,7,7,2,2,7,9,2,2,2,1,2,2,2,11,11,11,11,11,11,2,2,2,5,5,5,11,5,4,9,5,5,3,3,3,3},
			{3,3,3,3,3,3,3,9,9,7,9,1,6,6,1,7,11,7,2,2,2,2,1,6,6,1,1,6,6,1,7,7,7,3,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,7,9,9,2,2,2,1,2,2,2,11,11,11,11,2,2,2,2,2,5,5,5,5,5,4,9,5,5,3,3,3,3},
			{3,3,3,3,3,3,3,9,7,9,2,1,6,6,1,7,11,7,7,2,2,2,1,6,6,1,6,6,1,2,2,2,3,3,3,2,3,3,3,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,2,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,4,4,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,9,7,9,2,1,6,6,1,2,7,7,7,2,2,2,1,6,6,6,6,1,2,2,9,9,3,3,3,3,3,3,6,6,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,6,1,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,7,2,1,6,6,1,1,1,1,1,1,1,1,1,6,6,6,6,1,2,2,9,9,3,3,3,3,3,3,6,6,11,11,11,11,11,6,6,6,11,6,6,6,7,6,6,6,11,6,1,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,2,2,1,6,6,6,6,6,6,6,6,6,6,6,6,6,4,6,6,1,9,9,9,3,3,3,3,3,3,6,6,11,11,11,11,11,6,11,6,11,6,7,6,7,6,9,6,11,6,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,1,6,6,6,6,6,6,6,6,6,6,6,6,6,4,4,6,6,1,9,9,3,3,3,3,3,3,6,6,11,11,11,11,11,6,11,6,11,6,2,6,4,6,9,6,11,6,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,6,6,4,4,4,6,6,1,9,3,3,3,3,3,3,6,6,6,6,6,6,6,6,11,6,11,6,11,6,4,6,4,6,11,6,1,9,2,2,2,2,2,2,2,2,2,2,9,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,7,2,2,2,2,2,2,2,2,2,1,6,6,4,4,4,4,6,6,1,3,3,3,3,3,3,6,6,11,11,11,11,11,6,11,6,11,6,11,6,4,6,4,6,11,6,1,9,2,2,2,2,2,2,2,7,2,2,9,2,2,2,2,2,7,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,9,2,11,7,7,2,2,2,2,2,2,2,2,1,6,6,4,4,4,4,4,6,6,1,3,3,3,3,6,6,6,11,11,11,11,11,6,11,6,11,6,11,6,4,6,4,6,11,6,1,7,2,2,2,2,2,2,2,7,7,9,11,11,2,2,2,2,7,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,9,11,11,11,7,2,2,2,2,2,2,2,9,1,6,6,4,4,4,4,4,4,6,6,1,3,3,3,6,6,6,11,11,11,11,11,6,11,6,6,6,11,6,6,6,4,6,6,6,1,9,2,2,2,2,2,2,2,7,9,9,11,9,2,2,2,2,7,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,9,11,11,11,7,2,2,2,2,2,9,9,9,1,6,6,2,2,2,2,2,2,2,3,1,3,3,3,6,6,11,11,11,11,11,11,11,11,6,6,11,11,11,11,4,4,4,4,9,1,7,9,2,2,2,2,2,2,7,9,9,9,2,2,2,2,2,7,7,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,9,2,11,2,7,7,2,2,2,1,1,1,1,1,6,6,6,6,6,2,2,2,2,3,3,3,3,9,6,6,11,11,11,11,11,11,11,11,6,6,11,11,11,11,4,4,4,4,9,1,7,9,2,2,2,2,2,7,7,2,2,2,2,2,2,7,7,7,7,2,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,9,7,7,7,3,3,1,3,3,2,2,2,2,2,2,6,6,6,4,4,4,4,4,4,6,6,6,6,6,6,6,6,6,6,6,6,6,11,11,11,11,11,4,4,4,9,1,2,2,5,5,5,5,7,7,7,5,5,5,5,5,5,5,5,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,3,3,3,1,3,3,2,9,6,6,6,6,6,6,6,7,7,7,7,7,7,9,6,6,6,6,6,6,6,6,6,6,3,7,7,2,11,11,6,6,4,4,7,1,2,2,5,5,5,5,7,7,7,5,5,5,5,5,5,5,5,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,3,3,3,1,3,9,2,9,6,6,6,6,6,6,6,7,7,7,7,7,9,6,6,6,6,3,3,3,3,3,3,3,3,7,7,7,11,6,6,6,4,4,2,1,2,2,2,7,5,5,7,2,2,2,5,5,5,5,5,5,5,7,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,2,2,2,2,3,3,3,3,3,3,1,9,9,2,4,2,9,9,9,6,6,6,6,6,6,6,6,6,6,6,6,6,3,3,3,3,3,3,3,3,7,7,7,11,6,6,2,4,2,2,1,2,2,2,2,3,7,7,2,7,5,5,5,5,3,3,2,5,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,2,11,11,11,11,3,3,3,3,3,1,4,4,2,9,2,9,9,9,9,9,9,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,1,1,1,2,2,3,3,3,7,3,2,7,2,3,3,3,3,3,2,2,9,9,4,4,3,3,3,3},
			{3,3,3,3,3,3,2,3,11,1,1,1,11,3,3,3,3,3,1,4,4,9,9,9,9,1,1,1,6,6,11,11,11,11,6,6,11,11,6,6,3,3,3,3,3,3,3,3,3,3,1,1,6,6,1,2,2,2,2,1,1,1,1,1,7,3,2,2,11,3,3,3,3,3,9,9,9,9,4,4,3,3,3,3},
			{3,3,3,3,3,3,3,11,1,6,6,6,1,11,3,3,3,3,1,1,1,1,9,9,9,1,11,1,6,6,11,11,11,11,6,6,11,11,6,6,6,6,6,6,6,1,1,1,1,1,11,1,6,6,1,1,1,1,1,1,6,6,6,1,3,3,3,11,11,11,11,11,3,3,3,3,3,9,4,4,3,3,7,7},
			{3,3,3,3,3,3,11,1,6,6,5,6,6,1,11,3,3,3,3,3,3,1,1,1,1,1,11,1,6,6,11,11,11,11,6,6,11,11,6,6,6,6,6,6,6,6,6,6,6,1,11,1,6,6,6,6,6,6,6,6,6,6,6,6,1,11,11,11,11,11,11,11,3,3,3,3,3,9,4,4,3,7,7,3},
			{3,3,3,3,3,11,1,6,6,5,5,5,6,6,1,11,3,3,3,3,3,3,3,3,3,3,11,1,6,6,11,11,11,11,6,6,11,11,1,1,1,1,1,6,6,6,6,6,6,1,11,1,6,6,6,6,6,6,6,6,6,6,6,6,6,11,11,11,11,11,11,11,3,3,3,3,3,9,4,4,7,7,7,7},
			{3,3,3,3,11,1,6,6,5,5,5,5,5,6,6,1,11,11,11,11,11,11,11,11,11,11,11,1,6,6,11,11,11,11,6,6,11,11,11,11,11,1,1,1,1,1,6,6,1,3,11,1,6,6,6,6,6,6,6,6,6,6,6,6,1,11,3,11,11,11,11,11,3,3,3,3,3,9,4,4,7,7,7,7},
			{3,3,3,11,1,6,6,5,5,5,4,5,5,5,6,6,1,1,1,1,1,1,1,1,1,1,1,1,6,6,6,6,6,6,6,6,11,11,11,11,11,11,11,11,11,5,6,6,1,3,11,1,1,1,1,1,1,1,1,1,6,6,6,1,1,11,3,3,11,3,3,3,3,3,3,3,3,9,4,4,7,7,7,7},
			{3,3,11,1,6,6,5,5,5,4,4,4,5,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,5,6,6,1,3,11,11,11,11,11,11,11,11,11,11,1,1,1,1,11,11,3,3,3,3,3,3,3,3,3,3,3,9,4,4,7,7,7,7},
			{3,3,11,1,6,5,5,5,5,4,7,4,5,5,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,5,6,6,1,3,3,3,3,3,3,3,3,3,3,11,11,11,11,11,11,11,3,3,3,3,3,3,3,3,3,3,3,9,4,4,4,4,7,7},
			{3,3,11,1,6,6,5,5,5,4,7,4,5,5,5,6,6,1,1,1,1,1,1,1,1,1,1,1,6,6,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,6,6,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,4,4,4,4,4,4},
			{3,3,3,11,1,6,6,5,5,4,4,4,5,5,6,6,1,11,11,11,11,11,11,1,3,3,3,2,6,6,2,3,3,3,1,3,3,3,3,3,3,3,3,3,3,1,6,6,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,9,11,11,11,11,11},
			{3,3,3,3,11,1,6,6,5,5,5,5,5,6,6,1,11,3,3,3,3,3,3,1,3,3,3,2,2,2,2,3,3,3,1,3,3,3,3,3,3,3,3,3,3,1,6,6,1,1,1,1,1,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,11,9,9,11,11,11,11},
			{3,3,3,3,3,11,1,6,6,5,5,5,6,6,1,11,3,3,3,3,3,3,3,1,3,2,2,2,2,2,2,2,2,3,1,3,3,3,3,3,3,3,3,3,3,1,6,6,6,6,6,6,6,6,6,6,6,6,6,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,11,9,9,11,11,11,11},
			{3,3,3,3,3,3,11,1,6,6,5,6,6,1,11,3,3,3,3,3,3,3,3,1,3,2,2,2,2,2,2,2,2,3,1,3,3,3,3,3,3,3,3,3,3,1,6,6,6,6,6,6,6,6,6,6,6,6,6,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,11,11,9,9,11,11,11},
			{3,3,3,3,3,3,3,11,1,6,6,6,1,11,3,3,3,3,3,3,3,3,3,1,3,2,2,2,2,2,2,2,2,3,1,3,3,3,3,3,3,3,3,3,3,3,1,1,6,6,9,9,9,9,9,9,9,6,6,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,11,11,11,11,11,11,11},
			{3,3,3,3,3,3,3,3,11,1,1,1,11,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,1,6,6,2,2,2,2,2,2,2,6,6,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,11,11,11,11,11,11,11},
			{3,3,3,3,3,3,3,3,3,11,11,11,3,3,3,3,3,3,3,3,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3,3,3,1,6,6,3,3,3,3,3,3,3,6,6,1,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,3,3,11,11,11,11,11,11,11},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,6,6,3,3,3,3,3,3,3,6,6,1,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11},
			{3,3,3,3,3,3,9,9,9,3,3,3,3,2,2,2,2,3,3,3,3,3,7,3,2,2,3,3,3,3,3,3,9,9,9,3,3,3,3,3,3,3,3,3,3,3,3,1,6,6,3,3,3,3,3,3,3,6,6,1,11,11,11,11,11,2,11,11,11,11,11,11,11,11,2,2,7,11,11,11,11,11,11,11},
			{3,3,3,3,3,3,9,2,2,9,3,3,2,2,2,2,2,2,2,3,5,3,7,3,2,7,2,3,3,3,3,3,2,2,9,3,3,3,3,3,3,3,3,3,3,3,3,1,6,6,3,3,3,3,3,3,3,6,6,1,11,11,11,11,11,2,2,11,11,11,11,11,11,2,2,2,7,7,11,11,11,11,11,11},
			{3,3,3,3,3,3,7,7,7,9,3,3,2,2,2,2,2,2,2,2,2,5,5,5,5,5,5,5,5,5,5,5,5,5,2,9,3,3,3,3,3,3,3,3,3,3,3,1,6,6,7,7,7,7,7,7,1,6,6,1,9,11,11,11,11,11,2,11,11,11,11,11,11,2,2,2,7,7,11,11,11,11,11,11},
			{3,3,3,3,3,3,7,7,7,9,3,3,3,2,2,2,2,2,2,2,7,5,5,5,5,5,7,5,5,5,5,5,3,2,7,9,3,3,3,3,3,3,3,3,3,3,3,1,6,6,7,7,7,7,7,7,7,6,6,1,2,2,11,11,11,11,11,11,11,11,11,11,2,2,2,2,9,7,11,11,11,11,11,11},
			{3,3,3,3,3,3,7,7,7,2,2,7,2,2,2,2,7,7,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,1,6,6,6,6,6,6,6,6,6,6,6,1,7,7,7,7,7,11,11,11,11,9,11,11,2,7,7,7,7,5,5,5,5,5,5,5},
			{11,11,11,11,11,11,11,2,2,2,2,2,2,2,4,4,7,7,7,2,2,2,7,7,7,2,2,2,2,2,2,2,3,3,2,2,9,3,3,3,3,3,3,3,3,3,3,3,1,1,1,1,6,6,1,1,1,1,1,1,2,2,2,2,5,5,5,5,5,5,5,5,5,5,5,7,5,5,5,5,5,5,5,5},
			{11,11,11,11,11,11,11,2,2,2,2,2,2,2,4,4,7,7,7,2,2,7,7,7,7,2,2,2,2,2,2,2,3,3,2,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,7,1,2,2,1,2,3,3,3,3,2,2,3,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
			{11,11,11,11,11,11,11,4,2,2,2,2,2,2,7,7,7,7,2,2,2,7,7,2,7,2,2,2,2,2,9,2,2,3,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,2,2,3,3,3,3,3,3,3,3,2,2,5,5,5,5,5,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
			{11,11,11,11,11,11,11,4,2,2,2,11,2,2,7,9,7,7,2,2,2,7,3,2,7,2,2,2,2,2,9,2,2,3,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,7,2,7,3,3,3,3,3,3,3,3,2,2,2,2,5,5,5,5,9,9,9,5,5,5,5,5,5,5,5,5,5,5,5,5},
			{11,11,11,11,11,11,11,4,2,2,2,11,2,2,2,9,7,7,2,2,2,7,3,3,7,2,2,2,2,2,2,9,2,3,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,2,2,2,2,2,2,11,11,11,11,2,11,11,11,11,11,11,11,11,4,4,4,4,4,4},
			{11,11,11,11,11,11,11,4,4,2,2,11,2,2,2,9,7,7,2,2,2,2,3,3,2,2,2,2,2,2,2,2,2,3,9,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,2,5,11,11,11,11,11,11,11,11,11,2,7,2,11,4,4,4,4,4,11},
			{11,11,11,11,11,11,11,4,4,2,11,11,2,2,2,9,7,7,7,2,2,2,3,7,2,2,2,2,2,2,2,9,2,3,3,9,3,3,3,3,3,3,3,3,3,3,3,3,7,3,3,3,3,3,3,3,3,3,2,2,7,7,11,7,11,11,11,11,11,11,11,11,11,2,7,7,7,7,11,11,11,11,11,11},
			{11,11,11,11,11,11,11,11,11,11,11,11,2,2,9,7,7,7,5,5,2,5,7,7,4,2,2,2,2,2,2,9,2,3,3,9,2,3,3,3,3,3,3,3,3,3,3,3,7,3,3,2,3,3,3,3,3,3,2,2,7,7,11,11,7,11,11,11,11,11,11,11,9,7,9,7,9,7,11,11,11,11,11,11},
			{11,11,11,11,11,11,11,11,4,4,2,2,2,2,9,7,7,5,5,5,5,5,7,4,2,2,2,2,2,2,2,9,9,3,3,9,2,3,3,3,3,3,3,3,3,3,3,3,7,7,2,2,3,3,3,3,3,3,2,7,7,7,7,11,7,2,11,11,11,11,11,2,9,7,7,7,7,9,11,11,11,11,11,11},
			{11,11,11,11,11,4,9,9,4,4,2,2,2,2,2,7,5,5,5,5,5,5,5,4,4,2,2,7,2,2,2,2,2,3,3,3,9,3,3,3,3,3,3,3,3,3,3,3,3,7,7,3,3,3,3,3,3,3,2,7,7,7,2,11,7,2,11,11,11,11,2,2,7,7,7,9,7,11,11,11,11,11,11,11},
			{11,11,11,11,11,4,9,9,9,2,2,2,2,2,2,9,5,5,5,5,5,5,5,5,2,2,2,7,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,3,3,3,3,3,3,3,2,2,7,7,7,7,2,2,11,11,11,11,2,2,7,7,7,9,7,7,11,11,11,11,11,11},
			{11,11,11,11,11,4,9,9,9,2,2,2,2,2,2,9,5,5,5,5,5,5,5,5,5,4,2,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,7,3,3,3,3,3,2,2,2,7,7,2,2,2,11,11,11,11,2,2,9,7,7,7,9,7,11,11,11,11,11,11},
			{11,11,11,11,11,4,2,2,9,2,2,2,2,2,2,9,5,5,5,5,5,5,5,5,5,4,7,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,7,7,7,2,2,2,2,2,2,2,7,7,2,2,2,2,11,11,7,2,2,9,7,7,7,7,9,11,11,11,11,11,11},
			{11,11,11,11,11,4,4,2,2,2,2,2,2,2,2,9,5,5,5,5,5,5,5,5,5,7,7,5,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,7,7,7,7,2,2,2,2,2,2,2,2,2,2,2,2,7,11,7,2,2,9,7,9,9,7,9,11,11,11,11,11,11},
			{11,11,11,11,11,11,11,2,2,2,2,2,2,2,2,1,5,5,5,5,5,5,5,5,5,7,5,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,4,7,9,7,2,2,2,2,2,2,2,2,2,2,2,2,7,11,7,2,9,7,7,7,7,2,7,11,11,11,11,11,11},
			{11,11,11,11,11,11,11,11,2,2,2,2,2,2,5,5,9,11,11,4,9,5,5,5,5,5,7,7,2,2,2,2,2,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,4,4,2,9,2,2,2,2,2,2,2,2,2,2,2,2,2,7,7,2,2,9,7,9,9,7,9,2,11,11,11,11,11,11},
			{11,11,11,11,11,11,11,11,2,2,2,2,2,2,5,5,9,11,11,4,9,5,5,5,5,7,7,2,2,2,2,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,4,4,2,9,2,2,2,2,2,2,2,2,2,2,2,2,7,11,7,2,2,9,2,9,9,7,7,2,11,11,11,11,11,11},
			{11,11,11,11,11,11,11,11,11,2,2,2,2,5,5,5,2,11,11,4,4,5,5,5,5,7,2,2,2,2,2,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,2,9,2,2,2,2,2,2,2,2,2,2,2,7,7,11,7,2,2,2,9,2,2,9,9,9,11,11,11,11,11,11},
			{11,11,11,11,11,11,11,11,11,2,2,2,2,5,5,5,2,11,11,11,11,5,5,5,7,4,2,2,2,2,2,2,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,9,9,9,2,2,2,2,2,2,4,4,4,2,7,11,11,7,2,2,2,2,2,2,7,7,11,11,11,11,11,11,11}
		};

    static int row = 0;
	static int column = 0;
	static int actualRow=57;
	static int actualColumn=27;

    public static void showMaze(int torch, int viewport) {
        for (row=0; row<maze.length; row = row+1) {
            if ((actualRow+viewport>=row)&&(actualRow-viewport<=row)) {
                System.out.print(Colors.BLOCK);
                for (column=0; column<maze[row].length; column = column+1) {
                    
                    if (row==actualRow && column==actualColumn) {
                        if (Characters.boat == false && Characters.horse == false && Characters.flyingCarpet == false) {
                            System.out.print("_O_");
                        } else if (Characters.boat == true) {
                            System.out.print(":_;");
                        } else if (Characters.horse == true) {
                            System.out.print("_/*");
                        } else if (Characters.flyingCarpet == true) {
                            System.out.print("|_|");
                        }
                    } else if((actualColumn+viewport>=column)&&(actualColumn-viewport<=column)) {
                        if ((Math.pow(actualRow-row,2)+Math.pow(actualColumn-column,2))<=(Math.pow(torch,2))) {	

                            if (maze[row][column]==Colors.ID_FLOOR){
                                System.out.print(Colors.FLOOR);
                            }	
                            else if (maze[row][column]==Colors.ID_WALL){
                                System.out.print(Colors.WALL);
                            }
                            else if (maze[row][column]==Colors.ID_GRASS){
                                System.out.print(Colors.GRASS);
                            }	
                            else if (maze[row][column]==Colors.ID_WATER){
                                System.out.print(Colors.WATER);
                            }	
                            else if (maze[row][column]==Colors.ID_MEDIUM_GRASS){
                                System.out.print(Colors.MEDIUM_GRASS);
                            }	
                            else if (maze[row][column]==Colors.ID_SAND){
                                System.out.print(Colors.SAND);
                            }
                            else if (maze[row][column]==Colors.ID_TALL_GRASS){
                                System.out.print(Colors.TALL_GRASS);
                            }	
                            else if (maze[row][column]==Colors.ID_HEAVY_WATER){
                                System.out.print(Colors.HEAVY_WATER);
                            }
                            else if (maze[row][column]==Colors.ID_MOUNTAIN){
                                System.out.print(Colors.MOUNTAIN);
                            }
                        } else {
                            System.out.print(Colors.DARKNESS);
                        }
                    }
                }
                System.out.println(Colors.BLOCK);
            }
        }
        System.out.print(Colors.BLOCK);
        for(int i=0;i<=viewport*2;i=i+1){
            System.out.print(Colors.BLOCK);
        }
        System.out.println(Colors.BLOCK);	
    }
}