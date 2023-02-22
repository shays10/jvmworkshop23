for i in $(seq 1 6000)
do
   DIFF=$((10-1+1)) #Randomize numbers between 0 and 9
   R=$(($(($RANDOM%$DIFF))+X))
   curl -s http://localhost:8080?cityId=$R > /dev/null
done
