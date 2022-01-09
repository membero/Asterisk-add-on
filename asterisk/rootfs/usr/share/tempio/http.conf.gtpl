[general]
enabled=yes
bindaddr=0.0.0.0
bindport={{ .ingress_port }}
tlsenable=yes
tlsbindaddr=0.0.0.0:8089
tlscertfile={{ .certfile }}
tlsprivatekey={{ .keyfile }}