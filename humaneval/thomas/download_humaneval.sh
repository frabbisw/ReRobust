if [ ! -d "clm" ] ; then
    git clone https://github.com/lin-tan/clm.git
fi
cd clm/humaneval-java
tar -xvzf humaneval-java.tar.gz
cp -r humaneval-java/* .
rm -r humaneval-java
cd ../..
mkdir data
python preprocess_humaneval.py
