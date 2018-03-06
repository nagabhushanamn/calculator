#!/bin/bash
test $(curl localhost:8765/sum?a=10\&b=20) -eq 40