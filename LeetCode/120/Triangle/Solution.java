class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       if(triangle.size() == 0 || triangle == null)
           return 0;
       for(int i = 0 ; i<triangle.size();i++)
           for(int j = 0; j<triangle.get(i).size();j++) {
               if(i == 0 && j == 0)
                   ;
               else if(j == 0)
                   triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i-1).get(j));
               else if(j == triangle.get(i).size()-1)
                   triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i-1).get(j-1));
               else
                   triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j)));
           }
       int min = Integer.MAX_VALUE;
       for(int j = 0;j<triangle.get(triangle.size()-1).size();j++)
           if (min>triangle.get(triangle.size()-1).get(j))
               min = triangle.get(triangle.size()-1).get(j);
       return min;
    }
}