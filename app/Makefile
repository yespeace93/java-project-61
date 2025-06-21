.PHONY: clean build run-dist

## Очищаем старую сборку
clean:
	./gradlew clean

## Устанавливаем новую сборку
build: clean
	./gradlew installDist

## Запускаем сборку
run-dist: build
	./build/install/app/bin/app