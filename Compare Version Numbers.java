class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> list1 = Arrays.stream(version1.split("\\."))
                                 .map(Integer::parseInt)
                                 .collect(Collectors.toCollection(ArrayList::new));


        ArrayList<Integer> list2 = Arrays.stream(version2.split("\\."))
                                 .map(Integer::parseInt)
                                 .collect(Collectors.toCollection(ArrayList::new));

        if(list2.size() < list1.size()){
            while(list2.size() != list1.size()) list2.add(0);
        }else if(list2.size() > list1.size()){
            while(list1.size() != list2.size()) list1.add(0);
        }


        for(int i =0; i< Math.min(list1.size(),list2.size()); i++){
            if(list1.get(i) < list2.get(i)) return -1;
            else if(list1.get(i) > list2.get(i)) return 1;
        }
        return 0;
    }
}
