/al lo {locate %1}
/var taskall {
jade-ring;
jade-pin;
jade-boots;
}
/var tasktemp {
$taskall
}
/list taskall delete 1;
/al loall {/forall {$taskall}{lo &0}}
/al lotemp {/forall {$tasktemp}{lo &0}}

