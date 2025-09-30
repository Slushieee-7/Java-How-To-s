import { createClient } from '@supabase/supabase-js'

const supabase = createClient('https://uapxzqjlkegnavvlbngg.supabase.co', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVhcHh6cWpsa2VnbmF2dmxibmdnIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NTkyMDI4NzAsImV4cCI6MjA3NDc3ODg3MH0.4HygihZ9fIcxlPx7BgBE6fnom2X0A5eNmwAElKuvHac')

async function testConnection() {
	const { data, error } = await supabase
		.from('test')
		.insert({ id: 1, name: 'Rey', age: 20 }
    );

	if (error) {
		console.error('Insert failed:', error.message);
	} else {
		console.log('Insert successful:', data);
	}
}

testConnection();