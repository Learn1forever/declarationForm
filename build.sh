#!/bin/bash
#�����docker����
images=("baseData" "cottonQuota" "form" "license" "mainUI" "manifest" "processingTrade" "riskAnalysis" "tax" "taxCutting")
for var in ${images[@]};  
do  
    typeset -l lowerVar
    lowerVar=$var
    echo $lowerVar
    docker build -t $lowerVar $var
done