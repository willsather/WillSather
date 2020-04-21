##  Keyword Burst Tool
##  by Will Sather
##  v2, 10/17/2019
##
##  @params in directory:
##      csv file of single column of cities
##      csv file of keywords, example is house washing
##

##  directory also includes gutter_cleaning & window_cleaning

import csv

def burst (outFileName):
    
    with open('house_washing_keywords.csv','r',encoding='utf-8') as keywords, open('cities.csv','r',encoding='utf-8') as cities, open('testing.csv','w',encoding='utf-8') as write:
        keyword_reader = csv.reader(keywords)
        city_reader = csv.reader(cities)
        file_writer = csv.writer(write)

        originalList = []
        for line in keyword_reader:
                            
            for i in range(len(line)):
                
                line[i] = line[i].replace('\ufeff',"")

                line[i].strip().split(',')
                
                originalList.append(line)

## Check for Duplicates
##                            
##        for i in range(52):
##
##            for j in range(len(originalList[i])):
##                
##                if (originalList[i][j] == ''):
##                    #print(originalList[i][j])
##                    originalList[i].remove(originalList[i][j])

                
        cityList = []
        for line in city_reader:
                            
            for i in range(len(line)):
                
                line[i] = line[i].replace('\ufeff',"") # Replaces UTF-8 errors in reading
                line[i] = line[i].replace('\n',"")     # Replaces newlines with empty string

                line[i].strip().split(',')

            cityList.append(line)

        listTermCity = []
        listCityTerm = []
        for term in originalList:

            for termI in term: 
                
                for city in cityList:
                    
                    temp1List = []
                    temp2List = []
                    
                    for cityI in city: 
                        if (termI != ""):
                            
                            temp1List.append(termI + " in " + cityI)
                            temp2List.append(cityI + " " + termI)
                            
                        else:
                            temp1List.append("")
                            temp2List.append("")

                        listTermCity.append(temp1List)
                        listCityTerm.append(temp2List)


        file_writer.writerows(listTermCity)
        file_writer.nextRow()
        file_writer.writerows(listCityTerm)                    


## Writes original keywords out
##        
##        for line in house_reader:
##            
##            for i in range(len(line)):
##                
##                line[i] = line[i].replace('\ufeff',"")
##                
##            file_writer.writerow(line)
                    
      

def windowWashing ():
    
    with open('window_washing_keywords.csv','r') as csv_file:
        csv_reader = csv.reader(csv_file)

        for line in csv_reader:

            print(line[0])

def gutterCleaning ():
    
    with open('gutter_cleaning_keywords.csv','r') as csv_file:
        csv_reader = csv.reader(csv_file)

        for line in csv_reader:

            print(line[0])

def main():

    company = str(input("Enter the Company Name for this Keyword Burst: "))
    outFileStr = company + "_KeywordBurst.csv"

    #outFile = open(outFileStr,"w")
    #inCities = open("cities.csv","r")
    
    print("\nAnswer the following questions with 'y' or 'n'\n")
    
    houseBool = input("Do you want House Washing? : ").lower()
    #windowBool = input("Do you want Window Washing? : ").lower()
    #gutterBool = input("Do you want Gutter Cleaning? : ").lower()

    if (houseBool == 'y'):
        burst(outFileStr)
    else:
        print("Script Exited")
        
##    if (windowBool == 'y'):
##        windowWashing()
##        
##    if (gutterBool == 'y'):
##        gutterCleaning()

if __name__ == '__main__':
    main()
