select Combine.ledger_id, max(Combine.sold_at), max(Combine.size), sum(Combine.Cost), sum(Combine.Proceed), sum(Combine.Proceed) - sum(Combine.Cost) as Gain 
from
	(select CombineCost.ledger_id, null as sold_at, sum(CombineCost.size) Size, sum(CombineCost.Cost) Cost,  0 as Proceed
	from
		(select B.ledger_id, B.size, B.size * (C.price + C.fee_per) as Cost,  0 as Proceed
		from 
			transaction_ledger B
			join transaction C
				on B.transaction_id = C.id
				and C.transaction_type = -1  -- buy 
		) CombineCost
	group by ledger_id
	union
	select B.ledger_id, C.created_at as sold_at, B.size, 0 as Cost,  B.size * (C.price + C.fee_per) as Proceed
	from 
		transaction_ledger B
		join transaction C
			on B.transaction_id = C.id
			and C.transaction_type = 1 -- sold
			) Combine
group by Combine.ledger_id