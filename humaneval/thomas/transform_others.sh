#cd ..
if [ ! -d "JavaTransformer" ] ; then
    git clone https://github.com/mdrafiqulrabin/JavaTransformer.git
fi
cd JavaTransformer
## make a jar file from JavaTransformer
mvn clean compile assembly:single
# Output: target/jar/JavaTransformer.jar
cd ..
cp JavaTransformer/target/jar/JavaTransformer.jar ./

mkdir data/javatransform/input_data/buggy/
mkdir data/javatransform/input_data/fixed/
python line_to_file.py


java -jar JavaTransformer.jar data/javatransform/input_data/fixed/ data/javatransform/output_data/fixed/
java -jar JavaTransformer.jar data/javatransform/input_data/buggy/ data/javatransform/output_data/buggy/
python file_to_line.py
