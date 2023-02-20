## Commands:

```
kafka-topics --create --topic=test --bootstrap-server=localhost:9092 --partitions=3
```

```
kafka-topics --list --bootstrap-server=localhost:9092
```

```
kafka-topics --bootstrap-server=localhost:9092 --topic=test --describe
```

```
kafka-console-consumer --bootstrap-server=localhost:9092 --topic=test
```

```
kafka-console-consumer --bootstrap-server=localhost:9092 --topic=test --from-beginning
```

```
kafka-console-consumer --bootstrap-server=localhost:9092 --topic=test --group=x
```