#!/bin/bash
#���͵�registry����һ������Ϊregistryǰ׺
images=("baseData" "cottonQuota" "form" "license" "mainui" "manifest" "processingTrade" "riskAnalysis" "tax" "taxCutting")
for var in ${images[@]};  
do  
    typeset -l lowerVar
    lowerVar=$var
    docker tag $lowerVar "$1/$lowerVar"
    docker push "$1/$lowerVar"
done