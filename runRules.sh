#!/bin/bash

if [ "$1" = "simulated" ]; then
  dates=( 2008-02-13 2008-02-14 ) ## simulated data public schema dates
  mkdir $1-run
elif [ "$1" = "banner" ]; then
  dates=( 2016-01-01 2016-01-02 2016-01-03 2016-01-04 2016-01-05 2016-01-06 2016-01-07 2016-01-08 2016-01-09 2016-01-10 2016-01-11 2016-01-12 2016-01-13 2016-01-14 2016-01-15 2016-01-16 2016-01-17 2016-01-18 2016-01-19 2016-01-20 2016-01-21 2016-01-22 2016-01-23 2016-01-24 2016-01-25 2016-01-26 2016-01-27 2016-01-28 2016-01-29 2016-01-30 2016-01-31 2016-02-01 2016-02-02 2016-02-03 2016-02-04 2016-02-05 2016-02-06 2016-02-07 2016-02-08 2016-02-09 2016-02-10 2016-02-11 2016-02-12 2016-02-13 2016-02-14 2016-02-15 2016-02-16 2016-02-17 2016-02-18 2016-02-19 2016-02-20 2016-02-21 2016-02-22 2016-02-23 2016-02-24 2016-02-25 2016-02-26 2016-02-27 2016-02-28 2016-02-29 2016-03-01 2016-03-02 2016-03-03 2016-03-04 2016-03-05 2016-03-06 2016-03-07 2016-03-08 2016-03-09 2016-03-10 2016-03-11 2016-03-12 2016-03-13 2016-03-14 2016-03-15 2016-03-16 2016-03-17 2016-03-18 2016-03-19 2016-03-20 2016-03-21 2016-03-22 2016-03-23 2016-03-24 2016-03-25 2016-03-26 2016-03-27 2016-03-28 2016-03-29 2016-03-30 2016-03-31 ) ## full run of banner study period dates
  mkdir $1-run
else 
  echo "ERROR: Must input a command line argument for either 'simulated' or 'banner' when running this script" 
  exit 1
fi

for i in "${dates[@]}"

do
    echo INFO: Running engine on data extracted for $i;
    echo INFO: Output for this run will be written to $1-run/output-$i/idia-rules-run-$i.txt;
    mkdir $1-run/output-$i;
    java -Xmx8192m -jar target/droolstest-1.0.jar $i ${@:2} > $1-run/output-$i/idia-rules-run-$i.txt
    sleep 1    
done
echo INFO: run completed. Assembling the resulting data and writing it to $1-run/full-$1-run.tsv
grep -r "^DATA" $1-run/output* | sort | cut --complement -f1 > $1-run/full-$1-run.tsv
echo INFO: Assembling the unique resulting data and writing it to $1-run/uniq-$1-run.tsv
grep -r "^DATA" $1-run/output* | sort | uniq | cut --complement -f1 > $1-run/uniq-$1-run.tsv
echo INFO: All done!

